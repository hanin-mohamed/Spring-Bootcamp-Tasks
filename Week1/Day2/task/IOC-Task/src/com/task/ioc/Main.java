package com.task.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Square square = container.getBean("square",Square.class);
        System.out.println("the area of the Square "+square.getArea(input));
        Circle circle = container.getBean("circle",Circle.class);
        System.out.println("the area of the circle = "+circle.getArea(input));
    }
}