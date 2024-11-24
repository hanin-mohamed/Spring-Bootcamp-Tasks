package com.dependencyinjection.bean;

public class Square implements Shape{
    public Draw2D draw2D;
    public Draw3D draw3D;
    public DatabaseUtil databaseUtil;

    // setter injection
    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }
    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }
    public void setDatabaseUtil(DatabaseUtil databaseUtil) {this.databaseUtil = databaseUtil;}

    @Override
    public void draw() {
        draw2D.draw("Square");
        draw3D.draw("Square");
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
