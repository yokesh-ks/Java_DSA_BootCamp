package com.company;

import java.util.Scanner;

// Future Investment Value
// Future value = P * (1+ r)^n
// P= Present Value
// r= Interest rate
// n = number of interest compounding periods
public class Future_Investment_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Present Value : ");
        int P = input.nextInt();
        System.out.print("Enter the Interest rate : ");
        int r = input.nextInt();
        System.out.print("Enter the number of periods : ");
        int n = input.nextInt();
        double Future = investment(P, r, n);
        System.out.print("Future Investment Value is "+Future);
    }

    public static double investment(int P, int r, int n){
        // Future value = P * (1+ r)^n
        double in = 1 + (r/100);
        double res = 1;
        while(n!=0){
            res =res * in;
            n--;
        }
        double value = P * res;
        return value;
    }
}
