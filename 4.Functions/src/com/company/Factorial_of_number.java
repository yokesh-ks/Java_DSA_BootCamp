package com.company;

import java.util.Scanner;

// Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
// E.g.- 4! = 1 * 2 * 3 * 4 = 24 3! = 3 * 2 * 1 = 6 2! = 2 * 1 = 2 Also, 1! = 1 0! = 1
public class Factorial_of_number {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = input.nextInt();
        int ans = Factorial(num);
        System.out.print("Factorial is "+ans);
    }

    public static int Factorial(int num){
        int fact = 1;
        while(num!=0){
            fact = num * fact;
            num --;
        }
        return fact;
    }
}
