package com.springconfig.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
        draw2D.draw("Circle");
    }

}
