package com.task.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Square square = container.getBean("square",Square.class);
        square.setSide(5);
        System.out.println("the area of the Square "+square.getArea());
        Circle circle = container.getBean("circle",Circle.class);
        circle.setRadius(5);
        System.out.println("the area of the circle = "+circle.getArea());
    }
}