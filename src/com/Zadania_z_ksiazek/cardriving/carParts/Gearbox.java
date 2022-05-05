package com.Zadania_z_ksiazek.cardriving.carParts;

import com.Zadania_z_ksiazek.cardriving.GearSpeed;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    List<GearRatio>gearRatios = new ArrayList<>();
    int numberOfGears;
    boolean ifHasHalfGears;
    List<GearSpeed> gearSpeeds;

    public Gearbox(List<GearRatio> gearRatios, boolean ifHasHalfGears, List<GearSpeed> gearSpeeds) {
        this.gearRatios = gearRatios;
        this.numberOfGears = gearRatios.size();
        this.ifHasHalfGears = ifHasHalfGears;
        this.gearSpeeds = gearSpeeds;
    }
}

