package com.company;

import java.util.Scanner;

// Write a program to print the sum of two numbers entered by user by defining your own method.
public class Sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();
        int sum = sum(num1, num2);
        System.out.println("Sum of two number is "+sum);
    }

    static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

}
