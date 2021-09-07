package com.company;

import java.util.Scanner;

// Calculate Commission Percentage
// Commission Amount = Total sales * Commission Percentage /100
// Commission percentage = Commission Amount * 100 / Total Sales
public class Calculate_commission_percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total Sales ");
        double Total = input.nextDouble();
        System.out.print("Enter the Commission Amount ");
        double Comm = input.nextDouble();
        double perc = Comm * 100 /Total;
        System.out.println("Commission Percentage is "+perc);
    }
}
