package com.dependancyinjection.task;

public class Square implements Shape {
    private Draw2D draw2D;
    private Draw3D draw3D;
    @Override
    public void draw() {
        System.out.println("Drawing Square ! ");
    }

    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
        draw2D.draw();
    }

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
        draw3D.draw();
    }
}
