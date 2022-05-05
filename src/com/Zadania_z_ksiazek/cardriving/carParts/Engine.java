package com.Zadania_z_ksiazek.cardriving.carParts;

public class Engine {
    String carModel;
    int kW;
    int torque;
    int gears;
    boolean ifHasCompressor;
    FuelType fuel;

    public Engine(String carModel, int kW, int torque, int gears, boolean ifHasCompressor, FuelType fuel) {
        this.carModel = carModel;
        this.kW = kW;
        this.torque = torque;
        this.gears = gears;
        this.ifHasCompressor = ifHasCompressor;
        this.fuel = fuel;
    }
}
