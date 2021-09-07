package com.company;

import java.util.Scanner;

// Volume of Pyramid
// vol = l*w*h/3
public class Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length ");
        double length = input.nextDouble();
        System.out.print("Enter the width ");
        double width = input.nextDouble();
        System.out.print("Enter the heigth ");
        double height = input.nextDouble();
        double vol = length*width*height/3;
        System.out.println("Volume of Pyramid is "+vol);
    }
}
