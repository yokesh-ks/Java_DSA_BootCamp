package com.company;

import java.util.Scanner;

// Armstrong Number
// 153 = 1^3+5^3+3^3 = 153
public class Armstron_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int ans = armstrong(num);
        if (ans==num){
            System.out.print("Its a ArmStrong Number");
        } else {
            System.out.print("Its Not a ArmStrong Number");
        }
    }

    public static int armstrong(int num) {
        int total = 0;
        while(num!=0){
            int rem = num%10;
            total = total + rem*rem*rem;
            num = num/10;
        }
        return total;
    }
}
