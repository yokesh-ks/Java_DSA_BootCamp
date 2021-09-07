package com.company;

import java.util.Scanner;

// Calculate Discount Of Product
// final price = Original_price - (Discount * Original Price / 100)
public class Calculate_Discount_of_Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Original Price ");
        double Original_price = input.nextDouble();
        System.out.print("Enter the Discount of Product ");
        double discount = input.nextDouble();
        double Discount_price = Original_price - (Original_price*discount/100);
        System.out.println("Final Price of Product is "+Discount_price);
    }
}
