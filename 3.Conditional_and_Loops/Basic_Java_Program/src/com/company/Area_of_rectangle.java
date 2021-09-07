package com.company;

import java.util.Scanner;

// Area of Rectangle
// Area = b*h
public class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breath ");
        int breath = input.nextInt();
        System.out.print("Enter the height ");
        int height = input.nextInt();
        int area = breath*height;
        System.out.println("Area of Rectangle is "+area);
    }
}
