package com.company;

import java.util.Scanner;
import java.util.Stack;

// Calculate Average Marks
public class Calculate_Average_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Subject : ");
        int sub = input.nextInt();
        double total = Average(sub);
        System.out.print("Average Marks = "+(total/sub));
    }

    public static double Average(int sub){
        double total = 0;
        for(int i=1; i<=sub; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the mark of Subject-"+i+" : ");
            double mark = input.nextDouble();
            total = total + mark;
        }
        return total;
    }
}
