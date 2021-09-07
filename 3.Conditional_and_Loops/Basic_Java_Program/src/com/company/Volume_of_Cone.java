package com.company;

import java.util.Scanner;

// Volume of cone
// Volume = pi * r*r*h/3
// pi = 22/7
public class Volume_of_Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius ");
        double radius = input.nextDouble();
        System.out.print("Enter the height ");
        double height = input.nextDouble();
        double vol = (22/7)*radius*radius*height/3;
        System.out.println("Volume of Cone is "+vol);
    }
}
