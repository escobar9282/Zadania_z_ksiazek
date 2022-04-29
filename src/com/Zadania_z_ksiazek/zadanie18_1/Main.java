package com.Zadania_z_ksiazek.zadanie18_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Random justDoIt = new Random();
            int firstCube = justDoIt.nextInt(12 - 2) + 2;
            System.out.println("Throws of two cubes " + firstCube);
        }
    }
}
