package com.company;

import java.util.Scanner;

// Addition Of Two Numbers
public class Addition_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First Number ");
        double num1 = input.nextDouble();
        System.out.print("Enter a Second Number ");
        double num2 = input.nextDouble();
        double add = num1 +num2;
        System.out.println("Addition of Two numbers is "+add);
    }
}
