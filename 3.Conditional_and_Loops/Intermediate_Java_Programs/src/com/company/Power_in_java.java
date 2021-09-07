package com.company;

import java.util.Scanner;

// Power in Java
// 2^2 = 2*2
// 2^4 = 2*2*2*2
public class Power_in_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        System.out.print("Enter a power of the number ");
        int power = input.nextInt();
        int ans= 1;
        while(power!=0){
            ans = ans * num;
            power --;
        }
        System.out.print("Power of Number "+ ans);
    }
}
