package com.company;

import java.util.Scanner;

// Find if a number is palindrome or not
// A palindrome is a word that reads same as backward
public class Find_if_a_number_is_palindrome_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word ");
        String word = input.nextLine();
        String reverse ="";
        int len = word.length();
        for(int i=len-1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        System.out.println(word);
        System.out.println(reverse);
        if (word.equals(reverse)){
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is a not Palindrome");
        }
    }
}
