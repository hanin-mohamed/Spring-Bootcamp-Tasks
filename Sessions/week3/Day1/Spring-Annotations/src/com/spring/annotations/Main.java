package com.spring.annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Define Spring Container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean from Spring Container
        CircleShape circle = container.getBean("circleShape", CircleShape.class);
        RectangleShape rectangle = container.getBean("rectangleShape", RectangleShape.class);
        circle.getName();
        rectangle.getName();
    }
}