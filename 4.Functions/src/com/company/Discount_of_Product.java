package com.company;

import java.util.Scanner;

// Calculate Discount Of Product
// final price = Original_price - (Discount * Original Price / 100)
public class Discount_of_Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Original Price : ");
        int price = input.nextInt();
        System.out.print("Enter the Discount rate : ");
        int dis = input.nextInt();
        double ans = FinalCost(price, dis);
        System.out.print("Final Price of Product is "+ans);
    }

    public static double FinalCost(int price, int dis){
        double cost = price - (dis*price/100);
        return cost;
    }
}
