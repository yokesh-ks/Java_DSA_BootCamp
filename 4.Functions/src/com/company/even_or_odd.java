package com.company;

import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.
public class even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String ans = check(num);
        System.out.println(ans);
    }

    static String check(int num){
        if(num%2 == 0){
            return "number is even";
        }
        else {
            return "number is odd";
        }
    }

}
