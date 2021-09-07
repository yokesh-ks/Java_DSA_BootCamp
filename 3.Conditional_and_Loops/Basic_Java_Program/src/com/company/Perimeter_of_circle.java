package com.company;

import java.util.Scanner;

// Perimeter of Circle
// Perimeter = 2*pi*r
// pi = 22/7
public class Perimeter_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of Circle ");
        double radius = input.nextDouble();
        double peri = 2*22*radius/7;
        System.out.print("Perimeter of Circle is "+peri);
    }
}
