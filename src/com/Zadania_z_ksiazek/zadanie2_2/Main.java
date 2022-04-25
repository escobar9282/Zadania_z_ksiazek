package com.Zadania_z_ksiazek.zadanie2_2;

public class Main {
    public static void main(String[] args) {
        int a = 2, b = 50, c = 4;
        int delta = (int) (Math.pow(b, 2)  - 4 * a * c);
        if (delta > 0) {
            int power = (int) Math.sqrt(delta);
            int x1 = (-b - power) / 2 * a;
            int x2 = (-b - power) / 2 * a;
            System.out.printf("x1 = %d, x2 = %d", x1, x2);
        } else if (delta == 0) {
            int x0 = -b / 2 * a;
            System.out.printf("x0= %d", x0);
        } else {
            System.out.println("Brak rozwiązania");
        }
    }
}
//    Napisz program, który oblicza pierwiastki równania kwadratowego ax 2 +bx+c = 0 z
//        wykorzystaniem instrukcji warunkowej if , gdzie zmienne a , b i c to liczby
//        rzeczywiste wprowadzane z klawiatury. Dla zmiennych a , b , c , x1 oraz x2 należy
//        przyjąć format wyświetlania ich na ekranie z dokładnością do dwóch miejsc po przecinku.
