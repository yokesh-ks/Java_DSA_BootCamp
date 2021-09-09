package com.company;

import java.util.Scanner;

// Power In Java
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        System.out.print("Enter the power for the number : ");
        int power = input.nextInt();
        int ans = NumPower(num, power);
        System.out.println("Power of number is "+ans);
    }

    public static int NumPower(int num, int power){
        int res = 1;
        for(int i = 1; i<=power; i++){
            res = res * num;
        }
        return res;
    }
}
