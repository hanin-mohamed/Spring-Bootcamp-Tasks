package com.practice.bean;

public class Circle implements Shape{
    public Draw2D draw2D;
    public DatabaseUtil databaseUtil;
    public String username;

//     Constructor Injection
    public Circle(DatabaseUtil databaseUtil, String username) {
        this.databaseUtil = databaseUtil;
        this.username = username;
    }

    public Circle(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle! ");
    }

    @Override
    public void insertShape(String name) {
        System.out.println("connect to database with url "+databaseUtil.getUrl());
        System.out.println("Username: "+databaseUtil.getUsername());
        System.out.println("Inserting Shape : "+name);

    }
}
