package com.company;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers
// (HINT: while loop)
public class sum_of_all_number_till_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
        float num;
        do {
            System.out.print("Enter a number ");
            num = input.nextFloat();
            sum = sum + num;
        }while(num!= 0);
        System.out.print("Sum of all numbers is "+sum);
    }
}
