package com.spring.annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Define Spring Container
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean from Spring Container
        Circle circle = container.getBean("circle", Circle.class);
        Rectangle rectangle = container.getBean("rectangle", Rectangle.class);
        Triangle triangle = container.getBean("triangle", Triangle.class);
        circle.getName();
        rectangle.getName();
        rectangle.draw();
        circle.draw();
        triangle.draw();
      container.close();
    }
}