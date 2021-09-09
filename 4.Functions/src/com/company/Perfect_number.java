package com.company;

import java.util.Scanner;

// Perfect Number
// Any number can be perfect Number if the sum of its positive divisors excluding
// the number itself is equal to that number
// 28 is a Perfect Number
// Because 28 divisibe by 1, 2, 4, 7, 14
// 1 + 2 + 4 + 7 + 14 = 28
public class Perfect_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int ans = perfect(num);
        if(num == ans){
            System.out.println("It is a Perfect Number");
        } else {
            System.out.println("It is Not a Perfect Number");
        }
    }

    public static int perfect(int num){
        int sum = 0;
        for (int i = 1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
