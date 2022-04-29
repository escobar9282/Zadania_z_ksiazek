package com.Zadania_z_ksiazek.zadanie18_14;

public class MyRandomArray {
    public static void roundArray(double[] tab, int precision) {
        for (int actual = 0; actual < tab.length; actual++){
            System.out.printf("%.5f\n", tab[actual]);
        }
    }
}
