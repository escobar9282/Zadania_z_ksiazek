package com.Zadania_z_ksiazek.zadanie_030522;

public class Komputer {
    String processor;
    int memory;
    String unit;
    public Komputer(String processor, int memory, String unit) {
        this.processor = processor;
        this.memory = memory;
        this.unit = unit;
        System.out.println("Tworzę nowy komputer");
    }

    void  printInfo() {
        System.out.println(processor + "," + memory  + unit);
    }
}
