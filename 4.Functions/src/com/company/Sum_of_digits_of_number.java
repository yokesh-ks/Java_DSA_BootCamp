package com.company;

// Sum Of A Digits Of Number
import java.util.Scanner;

public class Sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        int ans = Sum(num);
        System.out.print("Sum of Digits of Number is "+ans);
    }

    public static int Sum(int num){
        int add = 0;
        while(num!=0){
            int rem = num%10;
            add = add + rem;
            num = num/10;
        }
        return add;
    }
}
