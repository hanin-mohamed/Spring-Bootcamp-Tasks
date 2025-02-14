package com.dependencyInjection.config.configg;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.dependencyInjection.config")
@PropertySource("classpath:application.properties")
public class Config {
}
