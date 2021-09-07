package com.company;

import java.util.Scanner;

// Calculate Distance Between Two Points
public class Calculate_Distance_between_Two_points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Point ");
        double First_point = input.nextDouble();
        System.out.print("Enter the Second Point ");
        double Second_point = input.nextDouble();
        double distance = Second_point - First_point;
        System.out.println("Distance Between Two points are "+distance);

    }
}
