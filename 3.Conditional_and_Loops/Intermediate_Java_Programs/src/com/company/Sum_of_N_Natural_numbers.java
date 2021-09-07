package com.company;

import java.util.Scanner;

// Sum Of N Numbers
// sum = n(n+1)/2
public class Sum_of_N_Natural_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the N number ");
        int n = input.nextInt();
        double sum = n * (n+1) /2;
        System.out.println("Sum of "+n+" number is "+sum);
    }
}
