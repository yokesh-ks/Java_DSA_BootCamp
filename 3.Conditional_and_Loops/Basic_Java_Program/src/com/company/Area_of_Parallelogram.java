package com.company;

import java.util.Scanner;

// Area of Parallelogram
// Area = b*h
public class Area_of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breadth ");
        int breadth = input.nextInt();
        System.out.print("Enter the height ");
        int height = input.nextInt();
        int area = breadth*height;
        System.out.println("Area of Parallelogram is "+area);
    }
}
