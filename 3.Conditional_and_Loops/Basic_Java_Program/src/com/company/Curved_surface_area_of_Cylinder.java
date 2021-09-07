package com.company;

import java.util.Scanner;

// Curved Surface Area Of Cylinder
// CSA = 2pi*r*h
public class Curved_surface_area_of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius ");
        double radius = input.nextDouble();
        System.out.print("Enter the Height ");
        double height = input.nextDouble();
        double CSA = 2*(22/7)*radius*height;
        System.out.println("Curved Surface Area of Cyclinder is "+CSA);
    }
}
