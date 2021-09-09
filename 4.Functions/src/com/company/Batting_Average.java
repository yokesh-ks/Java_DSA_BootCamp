package com.company;

import java.util.Scanner;

// Calculate Batting Average
// Batting Average = Number of Runs Scored / Number of Times Out
public class Batting_Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Runs Scored : ");
        int runs = input.nextInt();
        System.out.print("Number of Times out : ");
        int out = input.nextInt();
        int res = BattingAverage(runs, out);
        System.out.println("Batting average is "+res);
    }

    public static int BattingAverage(int runs, int out){
        int BA = runs/out;
        return BA;
    }
}
