package com.company;

import java.util.Scanner;

// Area of Circle Java Program
// Area = pi*r*r
// pi = 22/7
public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius ");
        int radius = input.nextInt();
        double area = 22*radius*radius/7;
        System.out.println("Area of Circle is "+area);
    }
}
