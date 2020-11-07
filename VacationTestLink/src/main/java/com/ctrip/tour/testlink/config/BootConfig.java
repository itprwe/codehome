package com.ctrip.tour.testlink.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hbhu on 2018/9/3.
 */
//@Configuration
public class BootConfig {

    @Value("${tomcatport:8088}")
    private  int port;

    @Bean
    public EmbeddedServletContainerFactory servletContainer(){
        return new TomcatEmbeddedServletContainerFactory(this.port);
    }
}
