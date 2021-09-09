package com.company;

import java.util.Scanner;

// Sum Of N Numbers = n(n+1)/2
public class Sum_of_N_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int ans = sum(num);
        System.out.print("Sum of First "+num+" numbers is "+ans);
    }

    public static int sum(int num){
        int total = num * (num+1) /2;
        return total;
    }
}
