package com.company;

import java.util.Scanner;

// Check Leap Year Or Not
// if Divisible by 4 then divisible by 100 then Divisible by 400 - leap Year
public class Check_Leap_year_or_not {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year ");
        int Year = input.nextInt();
        if (Year%4 == 0){
            if(Year%100 == 0){
                if (Year%400 == 0){
                    System.out.print("It is a Leap Year");
                }
                else{
                    System.out.print("It is a Not Leap Year");
                }
            }
            else{
                System.out.print("It is a Not Leap Year");
            }
        }
        else{
            System.out.print("It is a Not Leap Year");
        }
    }
}
