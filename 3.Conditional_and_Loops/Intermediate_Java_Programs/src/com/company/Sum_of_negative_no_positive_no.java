package com.company;

import java.util.Scanner;

// Write a program to print the sum of negative numbers,
// sum of positive even numbers and the
// sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class Sum_of_negative_no_positive_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int neg =0;
        int evenpos = 0;
        int oddpos = 0;
        do{
            System.out.print("Enter a number ");
            num = input.nextInt();
            if(num<0){
                neg = neg + num;
            }
            else if (num%2==0){
                evenpos = evenpos + num;
            }
            else{
                oddpos = oddpos +num;
            }
        } while(num!=0);
        System.out.println("Sum of Negative numbers "+neg);
        System.out.println("Sum of Even Positive Number "+evenpos);
        System.out.println("Sum of Odd Positive Number "+oddpos);
    }
}
