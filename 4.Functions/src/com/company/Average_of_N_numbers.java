package com.company;

import java.util.Scanner;

// Calculate Average Of N Numbers
// avg = (n+1)/2
public class Average_of_N_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int ans = avg(num);
        System.out.print("Average of Number is "+ans);
    }

    public static int avg(int num){
        int avg = (num + 1)/2;
        return avg;
    }
}
