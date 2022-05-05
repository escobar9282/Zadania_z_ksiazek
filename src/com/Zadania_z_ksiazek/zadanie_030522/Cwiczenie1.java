package com.Zadania_z_ksiazek.zadanie_030522;

public class Cwiczenie1 {
    public static void main(String[] args) {
        int x = 9;
        int y = 11;
        boolean result = x>y;
        System.out.println(result);
        result = (x*2>y);
        System.out.println(result);
        result = (x + 3 > y && y > x - 2);
        System.out.println(result);
        result = (x * y % 2 ==0);
        System.out.println(result);
    }
}
