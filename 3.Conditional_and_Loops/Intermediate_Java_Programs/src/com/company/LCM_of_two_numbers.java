package com.company;

import java.util.Scanner;

// LCM of two Number
// LCM = num1 * num2 / GCD(num1, num2)
public class LCM_of_two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number ");
        int num2 = input.nextInt();
        int mul = num1 * num2;
        while(num2%num1!=0){
            int rem = num2%num1;
            num2 = num1;
            num1 = rem;
        }
        System.out.println("LCM of two number is "+(mul/num1));
    }
}
