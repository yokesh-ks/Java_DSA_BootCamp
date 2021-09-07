package com.company;

import java.util.Scanner;

// Sum Of A Digits Of Number
public class Sum_of_a_Digits_of_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        int rem = 0;
        while(num%10!=0){
            rem = num%10 + rem;
            num = num/10;
        }
        System.out.print("Sum of a Digits of number is "+rem);
    }
}
