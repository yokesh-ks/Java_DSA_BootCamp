package com.company;

import java.util.Scanner;

// Area of isosceles Triangle
// area = a*a/2
// a = measure of equal angles of the isosceles triangle
public class Area_of_Isosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Triangle ");
        int angle = input.nextInt();
        int area = angle*angle/2;
        System.out.println("Area of Isosceles Triangle is "+area);
    }
}
