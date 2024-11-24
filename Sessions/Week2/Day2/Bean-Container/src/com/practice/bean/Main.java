package com.practice.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape rectangle = container.getBean("rectangleBean", Shape.class);
        rectangle.insertShape("Rectangle");

        Shape circle = container.getBean("circleBean", Shape.class);
        circle.insertShape("Circle");
        ((  ClassPathXmlApplicationContext) container).close();
    }
}