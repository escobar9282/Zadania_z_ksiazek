package com.Zadania_z_ksiazek.Zadania1_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner orb = new Scanner(System.in);
        double r = orb.nextDouble();
        double V = (4.0/3.0) * Math.PI * Math.pow(r, 3);

        System.out.printf("%.2f", V);
    }
}
//Zadanie 1.4
//        Napisz program, który oblicza objętość kuli o promieniu r .
//        Wartość promienia wprowadzamy z klawiatury. W programie należy przyjąć, że zmienne:
//        promień r i objętość są typu double (rzeczywistego). Dla tych zmiennych należy przyjąć
//        format wyświetlania na ekranie z dokładnością do dwóch miejsc po przecinku.
