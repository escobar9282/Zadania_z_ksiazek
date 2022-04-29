package com.Zadania_z_ksiazek.zadanie18_14;

public class Main {

    public static void main(String[] args) {
        double[] board = {1.87643, 45.8876, -90.86123, -680476.909090, 5801124, 5801123};
        MyRandomArray.roundArray(board ,5);

    }
}
//Zadanie 18.14.
//        Utwórz statyczną metodę void roundArray(double[] tab, int prec)
//        , która będzie zaokrąglać wszystkie liczby w tablicy tab do określonej
//        liczby miejsc po przecinku (parametr prec ).
//        Napisz program demonstrujący działanie tej metody. Dołącz ją do klasy MyRandomArray