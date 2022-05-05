package com.Zadania_z_ksiazek.cardriving;

import com.Zadania_z_ksiazek.cardriving.carParts.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("BMW M3 E92", 308, 400, 6, true, FuelType.GASOLINE);
        Gearbox gearbox = new Gearbox(List.of(
                new GearRatio(1200, 7900),
                new GearRatio(1379, 6890),
                new GearRatio(2010, 8976),
                new GearRatio(2010, 8976),
                new GearRatio(2010, 8976),
                new GearRatio(2010, 8976)
        ),false, List.of(
                new GearSpeed(0, 58),
                new GearSpeed(15, 98),
                new GearSpeed(23, 149),
                new GearSpeed(31, 202),
                new GearSpeed(38, 247),
                new GearSpeed(44, 322)
        ));
        SteeringWheel steeringWheel = new SteeringWheel(360, 40.786, 60.091);
        Exhaust exhaust = new Exhaust(2, 30);
        List<Wheel> wheels = List.of(
                new Wheel(true, "#800080", 5, 56, 0, 48),
                new Wheel(true, "#800080", 5, 56, 0, 48),
                new Wheel(true, "#800080", 5, 56, 0, 48),
                new Wheel(true, "#800080", 5, 56, 0, 48)
        );
        Car carBMW = new Car("BMW M3 E92", "#800080", 4, true, false, engine, gearbox, steeringWheel, wheels, List.of(exhaust));
    }
}
