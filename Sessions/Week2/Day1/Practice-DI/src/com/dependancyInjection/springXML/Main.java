package com.dependancyInjection.springXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape circle= context.getBean("circleBean",Shape.class);
        circle.draw();

        Shape Rectangle = context.getBean("rectangleBean",Shape.class);
        Rectangle.draw();

    }
}