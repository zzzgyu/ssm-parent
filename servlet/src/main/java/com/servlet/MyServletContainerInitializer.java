package com.servlet;

import com.servlet.component.UserFilter;
import com.servlet.component.UserListener;
import com.servlet.component.UserServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * @auther: zzzgyu
 */

@HandlesTypes(value = {HelloService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        for (Class<?> aClass : set) {
            System.out.println("--------------------感兴趣的类型----------------------");
            System.out.println(aClass);
        }
        System.out.println("注册Servlet三大组件");
        // 添加Servlet
        ServletRegistration.Dynamic userservlet = servletContext.addServlet("userServlet", UserServlet.class);
        userservlet.addMapping("/user");
        // 添加监听器
        servletContext.addListener(UserListener.class);
        // 添加过滤器
        FilterRegistration.Dynamic userFilter = servletContext.addFilter("userFilter", UserFilter.class);
        userFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    }
}
