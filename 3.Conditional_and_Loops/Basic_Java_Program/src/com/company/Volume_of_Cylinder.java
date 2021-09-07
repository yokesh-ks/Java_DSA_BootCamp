package com.company;

import java.util.Scanner;

// Volume of Cylinder
// Volume = pi * r*r*h
public class Volume_of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius ");
        double radius = input.nextDouble();
        System.out.print("Enter the height ");
        double height = input.nextDouble();
        double vol = (22/7)*radius*radius*height;
        System.out.println("Volume of Cylinder is "+vol);
    }
}
