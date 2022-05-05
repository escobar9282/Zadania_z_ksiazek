package com.Zadania_z_ksiazek.zadanie3;

public class Main {
    public static void main(String[] args) {
        int x = 12000;
        for (int i = 0; i < x; i++) {
            double sqrt =  Math.pow(2, i);
            if (sqrt < x) {
                System.out.println(sqrt);
            }
            }
        }
    }
//    Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
//        następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
//        liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
//        1
//        2
//        4
//        8
//        16
//        32
//        64