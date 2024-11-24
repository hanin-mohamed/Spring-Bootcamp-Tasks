package com.dependencyinjection.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape circle = container.getBean("circleBean",Circle.class);
        circle.draw();
        Shape square = container.getBean("squareBean",Square.class);
        square.draw();
        container.close();
    }
}