package com.dependencyinjection.bean;

public class Circle implements Shape{

    public Draw2D draw2D;
    public Draw3D draw3D;


    // Constructor injection
    public Circle(Draw2D draw2D, Draw3D draw3D) {
        this.draw2D = draw2D;
        this.draw3D = draw3D;
    }
    @Override
    public void draw() {
        draw2D.draw("Circle");
        draw3D.draw("Circle");
    }
}
