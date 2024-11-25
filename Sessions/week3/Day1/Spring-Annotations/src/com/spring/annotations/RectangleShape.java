package com.spring.annotations;


import org.springframework.stereotype.Component;

@Component
public class RectangleShape implements Shape {
    @Override
    public void getName() {
        System.out.println("Rectangle");
    }
}
