package com.company;

import java.util.Scanner;

// Perimeter of Rhombus
// peri = 4a
public class Perimeter_of_Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side ");
        double side = input.nextDouble();
        double peri = 4*side;
        System.out.println("Perimeter od Rhombus is "+peri);
    }
}
