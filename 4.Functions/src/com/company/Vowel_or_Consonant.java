package com.company;

import java.util.Scanner;

// Java Program Vowel Or Consonant
// vowel = a,e,i,o,u
public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Alphabet : ");
        char alp = input.next().charAt(0);
        String ans = vowel(alp);
        System.out.println(ans);
    }
    public static String vowel(char alp){
        switch (alp){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "It is Vowel letter";
            default:
                return "It is Constant letter";
        }
    }
}
