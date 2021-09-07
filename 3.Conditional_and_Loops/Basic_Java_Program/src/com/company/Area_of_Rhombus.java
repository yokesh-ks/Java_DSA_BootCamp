package com.company;

import java.util.Scanner;

// Area of Rhombus
// Area = d1 * d2 /2
// d1 = First Diagonal of Rhombus
// d2 = Second Diagonal of Rhombus
public class Area_of_Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Diagonal ");
        int d1 = input.nextInt();
        System.out.print("Enter the Second Diagonal ");
        int d2 = input.nextInt();
        int area = d1*d2/2;
        System.out.println("Area of Rhombus is "+area);
    }
}
