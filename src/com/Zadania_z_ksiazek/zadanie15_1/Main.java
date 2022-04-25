package com.Zadania_z_ksiazek.zadanie15_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczby");
        Scanner sum = new Scanner(System.in);
        int a = sum.nextInt();
        int b = sum.nextInt();
        int suma = a;
        for (int i = 0; i < b; i++) {
            suma ++;
        }
        System.out.println(suma);
    }
}
//Zadanie 15.1.
//        Użytkownik wprowadza z klawiatury dwie liczby naturalne.
//        Nie korzystając z operatora dodawania ( +), oblicz sumę tych liczb.
//        Napisz program obliczający sumę tych liczb, mając do dyspozycji operatory
//        inkrementacji ( ++) i dekrementacji ( ––).

