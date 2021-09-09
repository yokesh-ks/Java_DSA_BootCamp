package com.company;

import java.util.Scanner;

// Calculate Commission Percentage
// Commission Amount = Total sales * Commission Percentage /100
// Commission percentage = Commission Amount * 100 / Total Sales
public class Calculate_commission_percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Total Sales : ");
        int sales = input.nextInt();
        System.out.print("Enter a Commission Amount : ");
        int comm = input.nextInt();
        double ans = Comper(sales, comm);
        System.out.println("Commission Percentage is "+ans+"%");
    }

    public static double Comper(int sales, int comm){
        double per = comm * 100 / sales;
        return per;
    }

}
