package com.company;

import java.util.Scanner;

// Calculate Electricity Bill
// 1 unit = 2 rupee
// 1 unit = 1kWh // 1wh = 1/1000  unit
// 1 kWh = 1000 Watts * 24 Hrs * 30 Days
// cost of Electricity = Consumed Energy in 1kWh * Cost of 1 unit
public class Calculate_Electricity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Energy consumed by application in Watts ");
        int power = input.nextInt();
        double consumed = power * 24* 30/1000;
        int cost = 2;
        double total = consumed*cost;
        System.out.println("Electricity Bill is "+total);
    }
}
