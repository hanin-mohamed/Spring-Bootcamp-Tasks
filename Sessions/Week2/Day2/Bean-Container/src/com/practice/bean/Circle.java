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
       System.out.println("Inserting Shape : "+name);

    }
    @Override
    public void connectToDatabase() {
        System.out.println("init method called:\n connect to database with url "+databaseUtil.getUrl());
        System.out.println("Username: "+databaseUtil.getUsername());
    }

    @Override
    public void disconnectFromDatabase() {
        System.out.println("Destroy method called:\n disconnect from database with url "+databaseUtil.getUrl());
    }
}
