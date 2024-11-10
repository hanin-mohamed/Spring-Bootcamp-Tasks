package com.task.ioc;

public class Circle implements Shape{
    @Override
    public double getArea(int radius) {
        return radius *radius*(22/7);
    }
}
