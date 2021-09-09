package com.company;

import java.util.Scanner;

// Define a method that returns the product of two numbers entered by user.
public class Product_of_two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();
        int ans = product(num1, num2);
        System.out.print("Product of two number is "+ans);
    }

    public static int product(int num1, int num2){
        int product = num1 * num2;
        return product;
    }
}
