package com.company;

import java.util.Scanner;

// Input a number and print all the factors of that number (use loops).
// Factor of 18 = 1,2,3,6,9
// Factor of that number is number divide the given number excatly gives remainder zero
public class Factors_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        int i=1;
        while(i<num) {
            if (num%i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
