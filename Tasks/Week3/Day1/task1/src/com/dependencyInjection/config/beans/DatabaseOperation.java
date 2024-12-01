package com.springconfig.annotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DatabaseOperation {

    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String userName;

    @Value("${database.password}")
    private String password;

    @PostConstruct
    private void connectToDatabase(){
        System.out.println(String.format("connect to database %s with username %s and password %s", url, userName, password));
    }

    public void insertShape(String name){
        System.out.println(String.format("insert shape %s", name));
    }

}
