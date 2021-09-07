package com.company;

import java.util.Scanner;

// Calculate Average Marks
public class Calculate_average_Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Subject ");
        int sub = input.nextInt();
        float total = 0;
        for(int i=1; i<=sub; i++){
            System.out.print("Enter marks of Subject-"+i+" ");
            double marks = input.nextDouble();
            total += marks;
        }
        System.out.println("Average Marks = "+(total/sub));

    }
}
