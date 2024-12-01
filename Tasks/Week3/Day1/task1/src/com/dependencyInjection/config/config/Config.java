package com.springconfig.annotations.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springconfig.annotations")
@PropertySource("classpath:application.properties")
public class Config {
}
