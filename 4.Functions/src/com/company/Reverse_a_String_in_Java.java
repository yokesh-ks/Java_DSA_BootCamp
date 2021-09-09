package com.company;

import java.util.Scanner;

// Reverse A String In Java
public class Reverse_a_String_in_Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String word = input.nextLine();
        String ans = reverse(word);
        System.out.println("Reverse of Word is "+ans);
    }

    public static String reverse(String word){
        String res = "";
        int len = word.length();
        for(int i=len-1; i>=0; i--){
            res = res + word.charAt(i);
        }
        return res;
    }

}
