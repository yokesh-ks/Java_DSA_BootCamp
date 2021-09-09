package com.company;

import java.util.Scanner;

// Calculate Distance Between Two Points
public class Distance_between_two_points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Distance : ");
        int d1 = input.nextInt();
        System.out.print("Enter Second Distance : ");
        int d2 = input.nextInt();
        int ans = Distance(d1, d2);
        System.out.println("Distance b/w two points is "+ans);
    }

    public static int Distance(int d1, int d2){
        if (d1>d2){
            int distance = d1 - d2;
            return distance;
        }
        else{
            int distance = d2 - d1;
            return distance;
        }

    }

}
