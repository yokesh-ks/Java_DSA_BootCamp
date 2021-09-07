package com.company;

import java.util.Scanner;
import java.lang.Math;

// Area of Equilateral Triangle
// Area = Squareroot(3/4)*side*side
public class Area_of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side of Triangle ");
        double side = input.nextDouble();
        double area = (Math.sqrt(3))*side*side/4;
        System.out.println("Area of Equilateral Triangle is "+area);
    }

}
