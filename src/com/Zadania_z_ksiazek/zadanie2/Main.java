package com.Zadania_z_ksiazek.zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int myA = myScanner.nextInt();
        int myB = myScanner.nextInt();
        int mySum  = 0;
        for (int i = myA; i <=myB; i++) {
            mySum = mySum + i;
            System.out.println(mySum);
        }
    }
}
//    Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
//        A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
//        (A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
//        while, do-while, for