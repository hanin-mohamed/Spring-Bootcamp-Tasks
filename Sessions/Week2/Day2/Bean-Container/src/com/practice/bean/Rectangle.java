package com.practice.bean;


public class Rectangle implements Shape {
    public Draw2D draw2D;
    public DatabaseUtil databaseUtil;

    // setter injection
    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    public void setDatabaseUtil(DatabaseUtil databaseUtil) {
        this.databaseUtil = databaseUtil;
    }

    @Override
    public void draw() {
        draw2D.draw("Rectangle");

    }

    @Override
    public void  insertShape(String name){
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
