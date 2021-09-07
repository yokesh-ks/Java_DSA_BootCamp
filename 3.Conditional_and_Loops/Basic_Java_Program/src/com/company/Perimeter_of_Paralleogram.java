package com.company;

import java.util.Scanner;

// Perimeter of Parallelogram
// Perimeter = 2(Length + breath)
public class Perimeter_of_Paralleogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth ");
        double breadth = input.nextDouble();
        double peri = 2*(length + breadth);
        System.out.println("Perimeter of Paralleogram is "+peri);
    }
}
