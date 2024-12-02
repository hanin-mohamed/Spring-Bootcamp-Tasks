package com.task.ioc;

public class Circle implements Shape{
    int radius;


    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius *radius*(22/7);
    }
}
