package com.example.models;

import com.example.interfaces.FuelPowered;

public class Car extends Vehicle implements FuelPowered {
    private int fuelLevel;

    public Car() {
        super("Default Car", 2022, "Car");
        this.fuelLevel = 100;
    }

    public Car(String brand, int year, int fuelLevel) {
        super(brand, year, "Car");
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " engine started.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + brand);
        fuelLevel = 100;
    }

    public void drive() {
        System.out.println(brand + " is driving.");
    }

    public void drive(String destination) {
        System.out.println(brand + " is driving to " + destination);
    }
}
