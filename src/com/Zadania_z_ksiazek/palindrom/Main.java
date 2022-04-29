package com.Zadania_z_ksiazek.palindrom;

import java.util.Scanner;

public class Main {
    public static String reverseWord(String word) {
        String palindromeTwo = "";
        for (int i = word.length()-1; i >= 0; i--) {
            palindromeTwo = palindromeTwo + word.charAt(i);
        }
        return palindromeTwo;
    }
    public static void main(String[] args) {
        Scanner palindrome = new Scanner(System.in);
        String word = palindrome.nextLine();
        String reversedWord = reverseWord(word);
        if (word.equals(reversedWord)) {
            System.out.println("The word is a palindrome");

        }else {
            System.out.println("A word isn't a palindrome");
        }

    }
}
