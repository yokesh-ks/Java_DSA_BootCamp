package com.company;

import java.util.Scanner;

// Calculate CGPA Java Program
public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of Sem Completed : ");
        int sem = input.nextInt();
        double ans = gpa(sem);
        System.out.println("CGPA : "+(ans/sem));
    }

    public static double gpa(int sem){
        double marks = 0;
        for ( int i = 1; i<=sem; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the gpa of sem-"+i+" : ");
            double gpa = input.nextDouble();
            marks = marks + gpa;
        }
        return marks;
    }
}
