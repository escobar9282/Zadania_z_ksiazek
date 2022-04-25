package com.Zadania_z_ksiazek.zadanie1_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj Liczbe ");
        Scanner flotA = new Scanner(System.in);
        float x = flotA.nextFloat();
        float y = flotA.nextFloat();

        System.out.println("Suma = " + x + y);
        System.out.println("Różnica = " + (x - y));
        System.out.println("Iloczyn = " + x * y);
        System.out.println("Iloraz = " + x / y);
    }
}
//    Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz dla dwóch liczb x i y
//    wprowadzanych z klawiatury. W programie należy założyć, że zmienne x i y są typu float
//        (rzeczywistego). Dla zmiennych x , y , suma , różnica , iloczyn i iloraz należy przyjąć
//        format ich wyświetlania na ekranie z dokładnością do dwóch miejsc po przecinku.
