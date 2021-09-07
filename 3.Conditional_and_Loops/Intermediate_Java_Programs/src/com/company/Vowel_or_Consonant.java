package com.company;

import java.util.Scanner;

// Java Program Vowel Or Consonant
// Vowel = {a, e, i, o, u}
public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word ");
        char word = input.next().charAt(0);
        if(word =='a' || word =='e' || word =='i' || word =='o' || word =='u'){
            System.out.print("It is a Vowel");
        } else {
            System.out.print("It is a Consonant");
        }
    }
}
