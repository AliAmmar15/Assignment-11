package com.example.services;

import com.example.models.Vehicle;

public class VehicleService {
    public static void startVehicle(Vehicle vehicle) {
        vehicle.startEngine();
    }
}
