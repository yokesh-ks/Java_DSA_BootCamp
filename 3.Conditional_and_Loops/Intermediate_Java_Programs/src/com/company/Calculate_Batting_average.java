package com.company;

import java.util.Scanner;

// Calculate Batting Average
// Batting Average = Number of Runs Scored / Number of Times Out
public class Calculate_Batting_average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Runs Scored ");
        int runs = input.nextInt();
        System.out.print("Enter the No. Of Times Out ");
        int out = input.nextInt();
        int Batting_average = runs/out;
        System.out.print("Batting Average is "+Batting_average);
    }
}
