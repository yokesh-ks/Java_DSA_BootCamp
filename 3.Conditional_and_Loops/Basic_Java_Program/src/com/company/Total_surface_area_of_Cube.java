package com.company;

import java.util.Scanner;

// Total Surface Area Of Cube
// TSA = 6 *side *side
public class Total_surface_area_of_Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side ");
        double side = input.nextDouble();
        double TSA = 6 * side * side;
        System.out.println("Total Surface area of Cube is "+TSA);
    }
}
