package com.dependencyInjection.config.controller;

import com.dependencyInjection.config.beans.DatabaseOperation;
import com.dependencyInjection.config.configg.Config;
import com.dependencyInjection.config.model.Bike;
import com.dependencyInjection.config.model.Car;
import com.dependencyInjection.config.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@Component
public class BikeController implements VehicleController{


    @Autowired
    private DatabaseOperation dbOperation;
    @Override
    public void saveVehicle(Vehicle vehicle) {
        String sql = "INSERT INTO vehicle (type, brand) VALUES (?, ?)";
        try (PreparedStatement pstmt = dbOperation.getCon().prepareStatement(sql)) {
            pstmt.setString(1, ((Bike) vehicle).getType().toString());
            pstmt.setString(2,((Bike) vehicle).getBrand());
            pstmt.executeUpdate();
            System.out.println("Vehicle saved: " + ((Bike) vehicle).getBrand());
        } catch (SQLException e) {
            System.out.println("Error saving vehicle: " + e.getMessage());
        }
    }


//    @Override
//    public void updateVehicle(Vehicle vehicle) {
//        String sql = "UPDATE vehicle SET type=?, brand=? WHERE id=?";
//        try(PreparedStatement pstmt = dbOperation.getCon().prepareStatement(sql)){
//            pstmt.setString(1, ((Bike) vehicle).getType().toString());
//            pstmt.setString(2,((Bike)vehicle).getBrand());
//            pstmt.setInt(3,((Bike) vehicle).);
//            pstmt.executeUpdate();
//            System.out.println(String.format("Vehicle %s updated: ",id));
//        } catch (SQLException e){
//            System.out.println(String.format("Error updating vehicle: %s " ,e.getMessage()));
//        }
//    }
}
