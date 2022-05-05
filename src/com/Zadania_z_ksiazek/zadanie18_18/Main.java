package com.Zadania_z_ksiazek.zadanie18_18;

public class Main {
    public static void main(String[] args) {
    int[] tab = new int[] {89, 90, 67, 44, 31};
    double[] tab1 = Convert.intToDoubleArray(tab);
        for (double m:tab1
             ) {
            System.out.println(m);

        }
    }
}
//Zadanie 18.18.
//        Utwórz statyczną metodę konwertującą tablicę
//        liczb całkowitych na tablicę liczb zmiennoprzecinkowych
//        ( double[] intArrayToDouble(int[] tab)) oraz metodę ( int[]
//        doubleArrayToInt(double[] tab)) działającą odwrotnie.
