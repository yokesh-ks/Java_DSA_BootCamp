package com.company;

import java.util.Scanner;

// Compound Interest Java Program
// CI = [P(1+r)^n] - P
// P = Principal Amount
// r = rate of Interest
// n = number of Compounding Periods

public class Compound_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount ");
        double p = input.nextDouble();
        System.out.print("Enter Rate of Interest ");
        double r = input.nextDouble();
        System.out.print("Enter number of Compounding Periods ");
        double n = input.nextDouble();
        double temp = 1 + (r/100);
        double pow = 1;
        while (n!=0){
            pow = pow * temp;
            n--;
        }
        double ans = (p*pow)-p;
        System.out.println("Compound Interest = "+ans);


    }
}
