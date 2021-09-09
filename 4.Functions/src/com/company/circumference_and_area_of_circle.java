package com.company;

import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius
// entered by user by defining your own method
// circumference = 2 * pi * r
// area = pi * r *r
public class circumference_and_area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of Circle : ");
        double radius = input.nextDouble();
        circumference(radius);
        area(radius);
    }

    private static double circumference(double radius) {
        double circumference = 2 * (22/7) * radius;
        System.out.println("Circumference of circle is "+circumference);
        return circumference;
    }

    private static double area(double radius) {
        double area = (22/7) * radius * radius;
        System.out.println("Area of Circle is "+area);
        return area;
    }
}
