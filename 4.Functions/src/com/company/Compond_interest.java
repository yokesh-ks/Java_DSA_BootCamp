package com.company;

import java.util.Scanner;

// Compound Interest Java Program
// CI = [P(1+r)^n] - P
// P = Principal Amount
// r = rate of Interest
// n = number of Compounding Periods
public class Compond_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        double p = input.nextDouble();
        System.out.print("Enter the Rate of Interest : ");
        double r = input.nextDouble();
        System.out.print("Enter the No of periods : ");
        int n = input.nextInt();
        double ans = interest(p, r, n);
        System.out.println("Compound Interest is "+ans);
    }

    public static double interest(double p, double r, int n){
        double in = 1;
        while(n!=0){
            in = 1+(r/100) * in;
            n--;
        }
        double CI = p*in -p;
        return CI;
    }
}
