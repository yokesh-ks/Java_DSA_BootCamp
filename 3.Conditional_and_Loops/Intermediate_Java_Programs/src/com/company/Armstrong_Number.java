package com.company;

// Armstrong Number
// 153 = 1^3+5^3+3^3 = 153

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        int num_temp = num;
        int total = 0;
        while(num!=0){
            int rem = num%10;
            int temp_rem = rem * rem * rem ;
            total = total + temp_rem;
            num = num/10;
        }
        if(total==num_temp){
            System.out.println("Your entered number is Armstrong");
        } else{
            System.out.println("Your Entered number is not Armstrong");
        }

    }
}
