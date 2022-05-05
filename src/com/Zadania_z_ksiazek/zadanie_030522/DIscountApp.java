package com.Zadania_z_ksiazek.zadanie_030522;

public class DIscountApp {
    public static void main(String[] args) {


    String firstName = "Jan";
    String lastName = "Kowalski";
    boolean clientPremium = true;
    double price = 1100;
    double discountPrice = price;
    if(clientPremium && price > 1000) {
        discountPrice *= 0.86;
    }else if (price > 1000) {
        discountPrice *= 0.9;

    }else if (clientPremium) {
        discountPrice *= 0.96;

    }
        System.out.println("Witaj " + firstName + " " + lastName);
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);

}
}