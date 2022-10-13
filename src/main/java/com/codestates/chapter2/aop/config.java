package com.codestates.chapter2.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class config {
    @Bean
    public MyClass2 getMyClass(){
        return new MyClass2();
    }
}
