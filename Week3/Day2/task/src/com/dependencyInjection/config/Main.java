package com.dependencyInjection.config;



import com.dependencyInjection.config.configg.Config;
import com.dependencyInjection.config.controller.BikeController;
import com.dependencyInjection.config.controller.CarController;
import com.dependencyInjection.config.controller.PlaneController;
import com.dependencyInjection.config.model.Bike;
import com.dependencyInjection.config.model.Car;
import com.dependencyInjection.config.model.Plane;
import com.dependencyInjection.config.model.VehicleType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        CarController carController= container.getBean(CarController.class);
        PlaneController planeController= container.getBean(PlaneController.class);
        BikeController bikeController= container.getBean(BikeController.class);
        Car car = container.getBean(Car.class);
        Plane plane = container.getBean(Plane.class);
        Bike bike = container.getBean(Bike.class);
        car.setType(VehicleType.CAR);
        car.setBrand("cccc");
        carController.saveVehicle(car);
        plane.setType(VehicleType.PLANE);
        plane.setBrand("iiii");
        planeController.saveVehicle(plane);
        bike.setType(VehicleType.BIKE);
        bike.setBrand("kkkk");
        bikeController.saveVehicle(bike);
    }
}