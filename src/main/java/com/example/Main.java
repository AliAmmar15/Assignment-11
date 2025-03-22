package com.example;

import com.example.models.Car;
import com.example.models.ElectricCar;
import com.example.services.VehicleService;
import com.example.services.ElectricVehicleService;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2023, 50);
        ElectricCar tesla = new ElectricCar("Tesla", 2025, 100);

        VehicleService.startVehicle(myCar);
        VehicleService.startVehicle(tesla);

        ElectricVehicleService.chargeVehicle(tesla);
    }
}
