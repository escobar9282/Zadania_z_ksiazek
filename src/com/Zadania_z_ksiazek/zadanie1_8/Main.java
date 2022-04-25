package com.Zadania_z_ksiazek.zadanie1_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe do pola prostokąta: ");
        Scanner dbl = new Scanner(System.in);

        try {double a = dbl.nextDouble();
            double b = dbl.nextDouble();
            System.out.println("Pole prostokąta to: " + a * b);
        } catch
            (InputMismatchException exceptionOne){
            System.out.println("Za duza liczba albo chcemy mniej miejsc po przecinku");
    }
    }
}
