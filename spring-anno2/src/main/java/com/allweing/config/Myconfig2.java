package com.allweing.config;

import com.allweing.beanaop.LogAspect;
import com.allweing.beanaop.Math;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @auther: zzzgyu
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.allweing.bean"})
public class Myconfig2 {


    @Bean
    public LogAspect logAspect() {
        LogAspect logAspect = new LogAspect();
        return logAspect;
    }

    @Bean
    public Math math() {
        Math math = new Math();
        return math;
    }
}
