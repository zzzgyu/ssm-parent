package com.allweing.config;

import com.allweing.bean.Color;
import com.allweing.bean.GreenColor;
import com.allweing.bean.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

/**
 * @auther: zzzgyu
 */
@ComponentScan("com.allweing.bean")
public class MyConfig {

    @Bean
    public Color greenColor() {
        GreenColor greenColor = new GreenColor();
        return greenColor;
    }
}
