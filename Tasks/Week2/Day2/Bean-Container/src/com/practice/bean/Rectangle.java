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
        System.out.println("connect to database with url "+databaseUtil.getUrl());
        System.out.println("Username: "+databaseUtil.getUsername());
        System.out.println("Inserting Shape : "+name);
    }

}
