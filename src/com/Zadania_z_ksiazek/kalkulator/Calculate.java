package com.Zadania_z_ksiazek.kalkulator;

public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double myA = 3.9090187;
        double myB = 765.3167013;
        System.out.println(calculator.add(myB, myB));
        System.out.println(calculator.subtract(myA, myB));
        System.out.println(calculator.multiply(myA, myB));
        System.out.println(calculator.divide(myB,myA));
    }
}
