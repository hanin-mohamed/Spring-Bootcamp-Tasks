package com.dependencyinjection.bean;

public class Circle implements Shape{

    public Draw2D draw2D;
    public Draw3D draw3D;
    public DatabaseUtil databaseUtil;
    public String username;

    // Constructor injection


    public Circle(Draw2D draw2D, Draw3D draw3D, DatabaseUtil databaseUtil, String username) {
        this.draw2D = draw2D;
        this.draw3D = draw3D;
        this.databaseUtil = databaseUtil;
        this.username = username;
    }

    public Circle(DatabaseUtil databaseUtil, String username) {
        this.databaseUtil = databaseUtil;
        this.username = username;
    }

    @Override
    public void draw() {
        draw2D.draw("Circle");
        draw3D.draw("Circle");
    }

    @Override
    public void connectToDatabase() {
        System.out.println("init method called\nconnect to database with url "+databaseUtil.getUrl());
        System.out.println("Username: "+databaseUtil.getUsername());
    }

    @Override
    public void disconnectFromDatabase() {
        System.out.println("destroy method called\ndisconnect from database with url "+databaseUtil.getUrl());
    }
}
