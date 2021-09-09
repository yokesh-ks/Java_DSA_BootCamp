package com.company;

import java.util.Scanner;

// Depreciation of Value
// Depreciation is the process of deducing the total cost of something expensive
// you brought for your business
// Annual Depreciation Expense = (Cost of the Asset - Salvage Value)/Useful Life of the Asset
// cost of the Asset = Purchase Price of the asset
// Salvage Value = Value of the asset at the end of its useful life.
// Useful life of asset = number of periods or years in which asset is expected
public class Deprecition_of_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Cost of the Asset : ");
        int cost = input.nextInt();
        System.out.print("Enter the Salvage Value : ");
        int value = input.nextInt();
        System.out.print("Enter the Life of the Asset : ");
        int life = input.nextInt();
        int ans = Depreciation(cost, value, life);
        System.out.println("Depreciation is "+ans);
    }

    public static int Depreciation(int cost, int value, int life){
        int Depreciation = (cost - value)/life;
        return Depreciation;
    }
}
