package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class CircleShape implements Shape{
    @Override
    public void getName() {
        System.out.println("Circle");
    }
}
