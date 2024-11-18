package com.dependancyInjection.springXML;

public class Circle implements Shape{
    private Draw2D draw2D;
    private Draw3D draw3D;

    public Circle() {
    }

//     Constructor Injection
    public Circle(Draw2D draw2D, Draw3D draw3D) {
        this.draw2D = draw2D;
        this.draw3D = draw3D;
    }

    public Circle(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle! ");
    }
}
