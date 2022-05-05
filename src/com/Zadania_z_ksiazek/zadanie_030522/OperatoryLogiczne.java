package com.Zadania_z_ksiazek.zadanie_030522;

public class OperatoryLogiczne {
    //operator koniunkcji && zwraca wyłaćżnie true jeżeli obydwa warunki są spełnone
    //operator alternetywy || zwraca true gdy jeden z warunków jest spełniony
    //operator negacji ! zwraca przeciwieństwo wartości logicznej
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean logic = true;
        System.out.print("x < 10 && y < 11 ");
        System.out.println(x < 10 && y < 11);

        System.out.print("x < 10 && y < 10 ");
        System.out.println(x < 10 && y < 10);

        System.out.print("x < 10 || y < 10 ");
        System.out.println(x < 10 || y < 11);

        System.out.print(logic);
        System.out.print(",!logic = ");
        System.out.println(!logic);

        System.out.print("Warunek złożony !(x < 10 && y < 10) ");
        System.out.println(!(x < 10 && y < 10));
    }
}
