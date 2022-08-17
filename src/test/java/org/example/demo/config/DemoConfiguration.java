package org.example.demo.config;

import org.example.demo.components.HelloDemoComponent;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@TestConfiguration
public class DemoConfiguration {

    @Bean
    public HelloDemoComponent helloDemoComponent(){
        return new HelloDemoComponent();
    }
}


