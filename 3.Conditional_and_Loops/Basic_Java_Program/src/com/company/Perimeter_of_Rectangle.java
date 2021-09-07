package com.company;

import java.util.Scanner;

// Perimeter of Rectangle
// perimeter = 2(length+breadth)
public class Perimeter_of_Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length ");
        double length = input.nextDouble();
        System.out.print("Enter the Breadth ");
        double height = input.nextDouble();
        double peri = length*height;
        System.out.println("Perimeter of Rectangle is "+peri);
    }
}
