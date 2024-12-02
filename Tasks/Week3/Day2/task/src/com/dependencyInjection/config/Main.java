package com.dependencyInjection.config;

import com.dependencyInjection.config.beans.DatabaseOperation;
import com.dependencyInjection.config.beans.VehicleDTO;
import com.dependencyInjection.config.configg.Config;
import com.dependencyInjection.config.model.Bike;
import com.dependencyInjection.config.model.Car;
import com.dependencyInjection.config.model.Plane;
import com.dependencyInjection.config.model.Type;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        VehicleDTO vehicleDTO= container.getBean("vehicleDTO", VehicleDTO.class);
        Car car = container.getBean(Car.class);
        Plane plane = container.getBean(Plane.class);
        Bike bike = container.getBean(Bike.class);
        car.setType(Type.Car);
        car.setBrand("Toyota");
        plane.setType(Type.Plane);
        plane.setBrand("Boeing");
        bike.setType(Type.Bike);
        bike.setBrand("Honda");
        vehicleDTO.insertVehicle(car);
        vehicleDTO.insertVehicle(plane);
        vehicleDTO.insertVehicle(bike);
        vehicleDTO.deleteVehicle(1);
        vehicleDTO.updateVehicle(6, "Car", "hono");
        vehicleDTO.findVehicle(4);
        vehicleDTO.findVehicle(9);


    }
}