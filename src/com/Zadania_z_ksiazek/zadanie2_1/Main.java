package com.Zadania_z_ksiazek.zadanie2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą przyprostokątną: ");
        Scanner prostate = new Scanner(System.in);
        double prostate2 = Math.pow(prostate.nextDouble(), 2);
        prostate2 += Math.pow(prostate.nextDouble(), 2);
        double hypotenuse = Math.pow(prostate.nextDouble(), 2);
        if (prostate2 == hypotenuse) {
            System.out.println("Jest prostokatny");

        }else {
            System.out.println("Nie jest prostokątny");
        }
    }
}
//    Napisz program, który sprawdza dla trzech boków trójkąta a , b i c
//    wprowadzonych z klawiatury, czy tworzą one trójkąt prostokątny
//        (zakładamy, że a > 0 , b > 0 , c > 0 ).
