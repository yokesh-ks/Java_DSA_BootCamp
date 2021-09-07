package com.company;

import java.util.Scanner;

// Perimeter of Equilateral Triangle
// Perimeter = 3*a
// a= one side of Triangle
public class Perimeter_of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Triangle ");
        double side = input.nextDouble();
        double peri = 3*side;
        System.out.print("Perimeter of Equilateral Triangle is "+peri);
    }
}
