package com.company;

import java.util.Scanner;

// Future Investment Value
// Future value = P * (1+ r)^n
// P= Present Value
// r= Interest rate
// n = number of interest compounding periods
public class Future_Investment_Value {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Present Value ");
        double P = input.nextDouble();
        System.out.print("Enter the Interest rate ");
        double r = input.nextDouble();
        System.out.print("Enter the number of periods ");
        double n = input.nextDouble();
        double temp = 1+(r/100); // 1+r
        double value = 1;
        while(n!=0){
            value = value * temp;
            n--;
        }
        System.out.println("Future Investment Value is "+(P*value));
    }
}
