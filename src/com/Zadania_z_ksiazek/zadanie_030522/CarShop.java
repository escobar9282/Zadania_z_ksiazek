package com.Zadania_z_ksiazek.zadanie_030522;

public class CarShop {
    public static void main(String[] args) {
        Car audiA8 = new Car();
        audiA8.doors = 5;
        audiA8.carColor = "black";
        audiA8.wheelsColor = "silver";
        audiA8.tiresType = "slicks";
        audiA8.brand = "Audi";
        audiA8.modelOfCar = "A8";

        String audiInfo = audiA8.brand + " " + audiA8.modelOfCar +
                " Które ma " + audiA8.doors + " drzwi i jest koloru " + audiA8.carColor + " Ma on opony typu "
                + audiA8.tiresType + " i koła są koloru " + audiA8.wheelsColor;
        System.out.println("Wybrałeś następujący samochód ");
        System.out.println(audiInfo);
    }
}
