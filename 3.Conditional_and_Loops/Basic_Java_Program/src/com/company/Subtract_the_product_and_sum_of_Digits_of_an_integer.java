package com.company;

import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
// Input: n = 234
// Output: 15
// Explanation:
// Product of digits = 2 * 3 * 4 = 24
// Sum of digits = 2 + 3 + 4 = 9
// Result = 24 - 9 = 15
public class Subtract_the_product_and_sum_of_Digits_of_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int num = input.nextInt();
        int product = 1;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            product = rem * product;
            sum = rem + sum;
        }
        int sub = product - sum;
        System.out.print("Result = "+sub);
    }
}
