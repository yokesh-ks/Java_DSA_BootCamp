package com.company;

import java.util.Scanner;

// Find Ncr & Npr
// nPr = n!/(n-r)!
// nCr = n!/r!(n-r)!
// n = total number of things
// r = number of things to be chosen out of n things
public class Find_Ncr_and_Npr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of things ");
        int n = input.nextInt();
        System.out.print("Enter the total number of things to be chosen out ");
        int r = input.nextInt();
        int i = n-r;
        int n_value = 1;
        int r_value = 1;
        int i_value = 1;
        while(n!=0){
            n_value = n * n_value;
            n--;
        }
        while(r!=0){
            r_value = r * r_value;
            r--;
        }
        while(i!=0){
            i_value = i * i_value;
            i--;
        }
        System.out.println("Value of nCr = "+(n_value/(r_value*i_value)));
        System.out.println("Value of nPr = "+(n_value/i_value));
    }
}
