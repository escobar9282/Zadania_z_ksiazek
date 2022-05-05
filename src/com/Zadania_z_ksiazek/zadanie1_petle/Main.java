package com.Zadania_z_ksiazek.zadanie1_petle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        for (int i = 0; i <= myInt; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
//    Napisać program, który pobiera od użytkownika liczbę całkowitą
//        dodatnią, a następnie wyświetla na ekranie kolejno wszystkie
//        liczby niepatrzyste nie większe od
//        podanej liczby. Przykład, dla 15 program powinien wyświetlić
//        1, 3, 5, 7, 9, 11, 13,
//        15.
