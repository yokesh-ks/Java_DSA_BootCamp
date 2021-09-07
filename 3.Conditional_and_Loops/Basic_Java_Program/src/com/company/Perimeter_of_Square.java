package com.company;

import java.util.Scanner;

// Perimeter of Square
// Peri = 4a
// a = side
public class Perimeter_of_Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side ");
        double side = input.nextDouble();
        double peri = 4*side;
        System.out.println("Perimeter of Square is "+peri);
    }
}
