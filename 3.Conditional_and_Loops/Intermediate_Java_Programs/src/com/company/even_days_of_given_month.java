package com.company;

import java.util.Scanner;

// Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to check if he can go out in the month of August.
public class even_days_of_given_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Day you want to go out ");
        int day = input.nextInt();
        System.out.print("Enter a Month you want to go out ");
        String month = input.next();
        if (month.equals("August")){
            if (day%2==0){
                System.out.print("You can Go out");
            } else{
                System.out.print("You can can't Go out");
            }
        } else{
            System.out.print("You can can't Go out");
        }
    }
}
