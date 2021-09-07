package com.company;

import java.util.Scanner;

// Calculate CGPA
// CGPA - Cummulative Grade Point Average
public class Calculate_CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no of sem Completed ");
        int sem = input.nextInt();
        int temp = sem;
        float sum =0;
        while(temp!=0){
            System.out.print("Enter the gpa of sem-"+temp+" ");
            float gpa = input.nextFloat();
            temp--;
            sum = sum + gpa;
        }
        System.out.println("CGPA is "+(sum/sem));
    }
}
