package com.spring.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Rectangle implements Shape {
    private Draw2D draw2D;
    @Autowired
    public Rectangle(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    @Override
    public void getName() {
        System.out.println("Rectangle");
    }

    public void draw(){
        draw2D.draw("Rectangle");
    }

    @PostConstruct // after container before bean
    public void connectToDatabase(){
        System.out.println("connect to database");
    }

    @PreDestroy
    public void disconnectFromDatabase(){
        System.out.println("disconnect from database");
    }
}
