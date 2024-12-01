package com.springconfig.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Circle implements Shape {

    @Autowired
    private DatabaseOperation dbOperation;

    @Override
    public void getName() {
        System.out.println("Circle");
    }

    @Override
    public void insertShape(String shapeName) {
        dbOperation.insertShape(shapeName);
    }


}
