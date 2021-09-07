package com.company;

import java.util.Scanner;

// Calculate Average Of N Numbers
// Average of 5 = 1+2+3+4+5/5
// avg = (n+1)/2
public class Calaculate_Average_of_N_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        double num= input.nextDouble();
        double avg = (num+1)/2;
        System.out.println("Average of N number is "+avg);
    }
}
