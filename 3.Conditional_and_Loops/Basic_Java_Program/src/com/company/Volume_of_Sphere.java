package com.company;

import java.util.Scanner;

// Volume of Sphere
// Vol = 4/3 * pi * r * r * r
public class Volume_of_Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius ");
        double r = input.nextDouble();
        double volume = (4/3)*(22/7)*r*r*r;
        System.out.println("Volume of Sphere is "+volume);
    }
}
