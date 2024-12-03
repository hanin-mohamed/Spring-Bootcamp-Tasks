package com.dependencyInjection.config.controller;


import com.dependencyInjection.config.beans.DatabaseOperation;
import com.dependencyInjection.config.model.Plane;
import com.dependencyInjection.config.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class PlaneController implements VehicleController{

    private DatabaseOperation databaseOperation;
    @Autowired
    public void setDatabaseOperation(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
            String sql = "INSERT INTO vehicle (type, brand) VALUES (?, ?)";
            try (PreparedStatement pstmt = databaseOperation.getCon().prepareStatement(sql)) {
                pstmt.setString(1, ((Plane) vehicle).getType().toString());
                pstmt.setString(2, ((Plane) vehicle).getBrand());
                pstmt.executeUpdate();
                System.out.println("Vehicle saved: " + ((Plane) vehicle).getBrand());
            } catch (SQLException e) {
                System.out.println("Error saving vehicle: " + e.getMessage());
            }
    }
}
