package com.company;

import java.util.Scanner;

// Volume of Prism
// Vol = Length * Width * Height
public class Volume_of_Prism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length ");
        double length = input.nextDouble();
        System.out.print("Enter the Width ");
        double width = input.nextDouble();
        System.out.print("Enter the height ");
        double height = input.nextDouble();
        double vol = length * width * height;
        System.out.println("Volume of Prism is "+vol);

    }
}
