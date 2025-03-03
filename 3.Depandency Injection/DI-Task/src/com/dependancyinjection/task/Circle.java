package com.dependancyinjection.task;

public class Circle implements Shape {
    private final Draw2D draw2D;

    private final  Draw3D draw3D;

    public Circle(Draw2D draw2D, Draw3D draw3D) {
        this.draw2D = draw2D;
        this.draw3D = draw3D;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle ! ");
        draw2D.draw();
        draw3D.draw();
    }
}
