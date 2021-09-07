package com.company;

import java.util.Scanner;

// Area of Traingle
// Area = b*h/2
public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter breath ");
        int breath = input.nextInt();
        System.out.print("Enter height ");
        int height = input.nextInt();
        int area = breath*height/2;
        System.out.println("Area of Triangle is "+area);
    }
}
