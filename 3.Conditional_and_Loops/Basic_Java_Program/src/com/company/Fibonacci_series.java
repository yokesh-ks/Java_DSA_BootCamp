package com.company;

import java.util.Scanner;

// Fibonacci Series
// 1, 1, 2, 3, 5, 8, 13, 21, ...
// Sum of first two number is equal to third
// sum of Second and third is equal to fourth
// 1+1=2
// 1+2=3
// 2+3=5
// 3+5=8
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = input.nextInt();
        int a= 0;
        int b=1;
        int i;
        for(i=1; i<=num; i++){
            System.out.println(b);
            int temp = b;
            b=a+b;
            a = temp;
        }
    }
}
