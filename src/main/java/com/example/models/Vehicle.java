package com.example.models;

public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected final String type;

    public Vehicle() {
        this.brand = "Unknown";
        this.year = 2020;
        this.type = "Generic Vehicle";
    }

    public Vehicle(String brand, int year, String type) {
        this.brand = brand;
        this.year = year;
        this.type = type;
    }

    public abstract void startEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Type: " + type);
    }
}
