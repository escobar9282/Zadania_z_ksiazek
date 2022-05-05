package com.Zadania_z_ksiazek.zadanie_030522;

public class SklepKomputerowy {
    public static void main(String[] args) {
        Komputer komp1 = new Komputer("Intel i5", 16, "GB");
        Komputer komp2 = new Komputer("Pentium 90 Mhz", 640, "kB");

        komp1.printInfo();
        komp2.printInfo();
    }
}
