package com.example.services;

import com.example.interfaces.ElectricPowered;

public class ElectricVehicleService {
    public static void chargeVehicle(ElectricPowered vehicle) {
        vehicle.chargeBattery();
    }
}
