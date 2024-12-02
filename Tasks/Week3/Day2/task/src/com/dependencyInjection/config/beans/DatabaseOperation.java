package com.dependencyInjection.config.beans;


import com.dependencyInjection.config.model.Vehicle;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;
import java.util.Optional;

@Component
@Scope("singleton")
@Getter
@Setter
public class DatabaseOperation {

    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    private Connection con;
    @PostConstruct
    public void connectToDatabase() {
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            System.out.println("Failed to establish connection: " + e.getMessage());
        }
    }


    public void save(Vehicle vehicle) {
        String sql = "INSERT INTO vehicle (type, brand) VALUES (?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, vehicle.getType());
            pstmt.setString(2, vehicle.getBrand());
            pstmt.executeUpdate();
            System.out.println("Vehicle saved: " + vehicle.getType());
        } catch (SQLException e) {
            System.out.println("Error saving vehicle: " + e.getMessage());
        }
    }

    public Optional<Vehicle>findById(int id){
        String sql = "SELECT * FROM vehicle WHERE id=?";
        try(PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rslt = pstmt.executeQuery();
            if(rslt.next()){
                String type = rslt.getString("type");
                String brand = rslt.getString("brand");
                return Optional.of(new Vehicle(type, brand));
            }
            else{
                    System.out.println("No vehicle found with ID: " + id);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    public void update(int id, String type, String brand){
        String sql = "UPDATE vehicle SET type=?, brand=? WHERE id=?";
        try(PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1, type);
            pstmt.setString(2,brand);
            pstmt.setInt(3,id);
            pstmt.executeUpdate();
            System.out.println(String.format("Vehicle %s updated: ",id));
        } catch (SQLException e){
            System.out.println(String.format("Error updating vehicle: %s " ,e.getMessage()));
        }
    }

    public void deleteById(int id){
        String sql ="DELETE FROM vehicle WHERE id=?";
        try(PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Vehicle deleted: " + id);
        } catch (SQLException e){
            System.out.println("Error deleting vehicle: " + e.getMessage());
        }
    }

    @PreDestroy
    public void disconnectFromDatabase() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to close connection: " + e.getMessage());
        }
    }

}
