package com.dependencyInjection.config.beans;

import com.dependencyInjection.config.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Scope("prototype")
public class VehicleDTO {
    @Autowired
    private DatabaseOperation databaseOperation;


    public void insertVehicle(Vehicle vehicle) {
        databaseOperation.save(vehicle);
    }
    public void updateVehicle(int id, String type, String brand) {
        databaseOperation.update(id,type,brand);
    }
    public void deleteVehicle(int id) {
        databaseOperation.deleteById(id);
    }
    public Optional<Vehicle> findVehicle(int id) {
        return databaseOperation.findById(id);
    }
}
