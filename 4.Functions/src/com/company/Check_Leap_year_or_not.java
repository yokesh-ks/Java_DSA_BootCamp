package com.company;

import java.util.Scanner;

public class Check_Leap_year_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        String ans = Leap(year);
        System.out.print(ans);
    }

    public static String Leap(int year) {
        if (year%4 == 0){
            if(year%100 == 0){
                if (year%400 == 0){
                    return "It is a Leap Year";
                }
            }
        }
        return "It is not a Leap Year";
    }

}
