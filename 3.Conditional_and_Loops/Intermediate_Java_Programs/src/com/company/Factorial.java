package com.company;

import java.util.Scanner;

// Factorial Program
// 4! = 4*3*2*1
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = input.nextInt();
        int fact = 1;
        while(num!=0){
            fact = fact * num;
            num --;
        }
        System.out.println("Factorial of an number is "+fact);
    }
}
