package com.Zadania_z_ksiazek.firma;

import java.util.List;

public class Company {
    List<Emplyee> emplyeeList = List.of(
            new Emplyee(44, "Jaroslaw", "Kowalewski", 83012102292L, 1983, 3),
            new Emplyee(34, "Boniek", "Zbigniew", 52436783764L, 1959, 10),
            new Emplyee(45, "Bob", "Marley", 67051345678L, 1967, 2)
    );
    public void showEmployees(){
        for (Emplyee emplyee:emplyeeList) {
            System.out.println();
            System.out.println("name " + emplyee.firstName + " lastName " + emplyee.lastName);
        }
    }
}
