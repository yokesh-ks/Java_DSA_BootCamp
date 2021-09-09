package com.company;

import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class Vote_if_age_greater_than_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = input.nextInt();
        String ans = eligible(age);
        System.out.print(ans);
    }

    static String eligible(int age){
        if(age>=18){
            return "You are Eligible to Vote";
        } else {
            return "You are not Eligible to Vote";
        }
    }

}
