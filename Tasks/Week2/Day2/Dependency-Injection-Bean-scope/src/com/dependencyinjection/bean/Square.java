package com.dependencyinjection.bean;

public class Square implements Shape{
    public Draw2D draw2D;
    public Draw3D draw3D;

    // setter injection
    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }
    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }

    @Override
    public void draw() {
        draw2D.draw("Square");
        draw3D.draw("Square");    }
}
