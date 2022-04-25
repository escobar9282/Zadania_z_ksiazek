package com.Zadania_z_ksiazek.zadanie15_6;

public class Main {
    public static void main(String[] args) {
    int sqrt = 25;
    int sumSqrt= 0;
        for (int i = 1; i <Integer.MAX_VALUE; i++) {
            if (i*i == sqrt) {
                sumSqrt = i; break;
            }
        }
        System.out.println(sumSqrt);
    }
}
//Zadanie 15.6.
//        Napisz program obliczający całkowity pierwiastek kwadratowy z
//        podanej liczby naturalnej. Nie korzystaj przy tym z funkcji bibliotecznych
//        oraz innych metod przybliżonego obliczania pierwiastka kwadratowego i zaokrąglenia
//        otrzymanego wyniku zmiennoprzecinkowego do liczby całkowitej.
