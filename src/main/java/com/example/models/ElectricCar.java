package com.example.models;

import com.example.interfaces.ElectricPowered;

public class ElectricCar extends Car implements ElectricPowered {
    private int batteryLevel;

    public ElectricCar() {
        super("Tesla", 2022, 100);
        this.batteryLevel = 100;
    }

    public ElectricCar(String brand, int year, int batteryLevel) {
        super(brand, year, 0);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void chargeBattery() {
        System.out.println(brand + " is charging.");
        batteryLevel = 100;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " electric engine started.");
    }
}
