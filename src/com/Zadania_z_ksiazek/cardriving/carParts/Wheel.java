package com.Zadania_z_ksiazek.cardriving.carParts;

public class Wheel {
    boolean ifHasAlloyWheels;
    String colorInHexadecimal;
    int howManyScrubs;
    int numberOfSpunkies;
    int numberOfArms;

    public Wheel(boolean ifHasAlloyWheels, String colorInHexadecimal, int howManyScrubs, int numberOfSpunkies, int numberOfArms, int wheelWidth) {
        this.ifHasAlloyWheels = ifHasAlloyWheels;
        this.colorInHexadecimal = colorInHexadecimal;
        this.howManyScrubs = howManyScrubs;
        this.numberOfSpunkies = numberOfSpunkies;
        this.numberOfArms = numberOfArms;
        this.wheelWidth = wheelWidth;
    }

    int wheelWidth;
}
