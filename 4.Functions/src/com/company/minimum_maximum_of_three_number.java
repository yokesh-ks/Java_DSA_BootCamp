package com.company;

// Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by user.

import java.util.Scanner;

// A > B; A is max B > C; B is max; C > A; C is max
public class minimum_maximum_of_three_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number-1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number-2 : ");
        int num2 = input.nextInt();
        System.out.print("Enter number-3 : ");
        int num3 = input.nextInt();
        String max = max(num1, num2, num3);
        System.out.println(max);
        String min = min(num1, num2, num3);
        System.out.println(min);
    }

    public static String max(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return "num1 is maximum";
        }
        else if (num2 > num1 && num2 > num3) {
            return "num2 is maximum";
        }
        else{
            return "num3 is maximum";
        }
    }

    public static String min(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3){
            return "num1 is minimum";
        }
        else if (num2 < num1 && num2 < num3) {
            return "num2 is minimum";
        }
        else{
            return "num3 is minimum";
        }
    }

}
