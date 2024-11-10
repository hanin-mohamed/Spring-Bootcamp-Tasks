package com.task.ioc;

public class Square implements Shape{

    @Override
    public double getArea(int r) {
        return r*r;
    }
}
