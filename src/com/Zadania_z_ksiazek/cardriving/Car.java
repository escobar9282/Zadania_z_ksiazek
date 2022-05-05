package com.Zadania_z_ksiazek.cardriving;

import com.Zadania_z_ksiazek.cardriving.carParts.*;

import java.util.List;

public class Car {
    String fullModelName;
    String colorInHex;
    int numberOfDoors;
    boolean whetherTheWindowsAreTinted;
    boolean whetherTheEngineIsInFront;
    Engine engine;
    Gearbox gearbox;
    SteeringWheel steeringWheel;

    List<Wheel> wheels;
    List<Exhaust> exhausts;

    public Car(String fullModelName, String colorInHex, int numberOfDoors, boolean whetherTheWindowsAreTinted, boolean whetherTheEngineIsInFront, Engine engine, Gearbox gearbox, SteeringWheel steeringWheel, List<Wheel> wheels, List<Exhaust> exhausts) {
        this.fullModelName = fullModelName;
        this.colorInHex = colorInHex;
        this.numberOfDoors = numberOfDoors;
        this.whetherTheWindowsAreTinted = whetherTheWindowsAreTinted;
        this.whetherTheEngineIsInFront = whetherTheEngineIsInFront;
        this.engine = engine;
        this.gearbox = gearbox;
        this.steeringWheel = steeringWheel;
        this.wheels = wheels;
        this.exhausts = exhausts;

    }

    public String getFullModelName() {
        return fullModelName;
    }

    public void setFullModelName(String fullModelName) {
        this.fullModelName = fullModelName;
    }

    public String getColorInHex() {
        return colorInHex;
    }

    public void setColorInHex(String colorInHex) {
        this.colorInHex = colorInHex;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isWhetherTheWindowsAreTinted() {
        return whetherTheWindowsAreTinted;
    }

    public void setWhetherTheWindowsAreTinted(boolean whetherTheWindowsAreTinted) {
        this.whetherTheWindowsAreTinted = whetherTheWindowsAreTinted;
    }

    public boolean isWhetherTheEngineIsInFront() {
        return whetherTheEngineIsInFront;
    }

    public void setWhetherTheEngineIsInFront(boolean whetherTheEngineIsInFront) {
        this.whetherTheEngineIsInFront = whetherTheEngineIsInFront;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public List<Exhaust> getExhausts() {
        return exhausts;
    }

    public void setExhausts(List<Exhaust> exhausts) {
        this.exhausts = exhausts;
    }
}
