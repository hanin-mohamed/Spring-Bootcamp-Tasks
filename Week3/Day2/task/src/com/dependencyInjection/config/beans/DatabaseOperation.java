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
    private void connectToDatabase() {
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully.");

        } catch (SQLException e) {
            System.out.println("Failed to establish connection: " + e.getMessage());
        }
    }
    @PreDestroy
    private void disconnectFromDatabase() {
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
