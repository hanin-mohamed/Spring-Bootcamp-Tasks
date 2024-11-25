package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    private Draw2D draw2D;

    @Autowired
    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    @Override
    public void getName() {
        System.out.println("Circle");
    }
    public void draw(){
        draw2D.draw("Rectangle");
    }

}
