package com.servlet.component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @auther: zzzgyu
 */

/**
 *
 */
public class UserListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("UserListener-------contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("UserListener---------contextDestroyed");
    }
}
