package com.dependencyInjection.config.controller;

import com.dependencyInjection.config.beans.DatabaseOperation;
import com.dependencyInjection.config.model.Car;
import com.dependencyInjection.config.model.Vehicle;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@Component
public class CarController implements VehicleController {

    private DatabaseOperation databaseOperation;

    public CarController(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
            String sql = "INSERT INTO vehicle (type, brand) VALUES (?, ?)";
        try (PreparedStatement pstmt = databaseOperation.getCon().prepareStatement(sql)) {
                pstmt.setString(1, ((Car) vehicle).getType().toString());
                pstmt.setString(2,((Car) vehicle).getBrand());
                pstmt.executeUpdate();
                System.out.println("Vehicle saved: " + ((Car) vehicle).getType().toString());
            } catch (SQLException e) {
                System.out.println("Error saving vehicle: " + e.getMessage());
            }
    }
}
