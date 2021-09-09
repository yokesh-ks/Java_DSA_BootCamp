package com.company;

import java.util.Scanner;

// Define a method to find out if number is prime or not.
public class Number_is_prime_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        String ans = prime(num);
        System.out.println(ans);
    }

    public static String prime(int num) {
        int i = 2;
        while(i<num) {
            int rem = num % i;
            if(rem==0){
                return "It is a not prime";
            }
            i++;
        }
        return "It is a Prime";
    }
}
