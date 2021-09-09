package com.company;

import java.util.Scanner;

// Write a function to find if a number if palindrome or not. Take number as parameter.
// palindrome - A number remains same when its digit is reversed
public class Palindrome_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if(num == pal(num)){
            System.out.print("It is a palindrome number");
        } else {
            System.out.print("It is a not palindrome number");
        }
    }

    public static int pal(int num){
        int rem = 0;
        while(num!=0){
            rem = rem*10 +num%10;
            num=num/10;
        }
        return rem;
    }

}
