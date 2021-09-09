package com.company;

import java.util.Scanner;

// Find if a number is palindrome or not
// A palindrome is a word that reads same as backward
public class Number_is_Palindrome_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String num  = input.next();
        String ans = palindrome(num);
        if (num.equals(ans)){
            System.out.print("It is a Palindrome Number");
        }
        else{
            System.out.print("It is Not a Palindrome Number");
        }
    }

    public static String palindrome(String num){
        String res = "";
        int len = num.length();
        for(int i=len-1; i>=0; i--){
            res = res + num.charAt(i);
        }
        return res;
    }
}

