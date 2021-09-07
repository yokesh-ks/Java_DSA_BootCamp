package com.company;

import java.util.Scanner;

// Calculate Depreciation of Value
// Depreciation is the process of deducing the total cost of something expensive
// you brought for your business
// Annual Depreciation Expense = (Cost of the Asset - Salvage Value)/Useful Life of the Asset
// cost of the Asset = Purchase Price of the asset
// Salvage Value = Value of the asset at the end of its useful life
// Useful life of asset = number of periods\years in which asset is expected
public class Calculate_Depreciation_of_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Cost of the Asset ");
        double buying_cost = input.nextDouble();
        System.out.print("Enter a Salvage value ");
        double salvage_value = input.nextDouble();
        System.out.print("Enter life in years ");
        double life = input.nextDouble();
        double value = (buying_cost - salvage_value)/life;
        System.out.println("Depreciation of Value is "+value);
    }
}
