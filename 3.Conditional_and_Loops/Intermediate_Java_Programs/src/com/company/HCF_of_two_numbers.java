package com.company;

import java.util.Scanner;

// HCF of Two Numbers
//  largest possible number that divides the given numbers leaving the remainder 0.
public class HCF_of_two_numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First number ");
        int num1 = input.nextInt();
        System.out.print("Enter a Second number ");
        int num2 = input.nextInt();
        while(num2%num1!=0){
            int rem = num2%num1;
            num2 = num1;
            num1 = rem;
        }
        System.out.println("GCD of two number is "+num1);
    }
}
