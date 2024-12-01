package com.dependencyInjection.config.beans;

import com.dependencyInjection.config.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VehicleDTO {
    @Autowired
    private DatabaseOperation databaseOperation;


    public void insertVehicle(Vehicle vehicle) {
        databaseOperation.save(vehicle);
    }

}
