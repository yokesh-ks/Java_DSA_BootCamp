package com.company;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class print_the_largest_number_from_all_until_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num, large;
        large = 0;
        do{
            System.out.print("Enter a number ");
            num = input.nextFloat();
            if (large<num){ //20<25 //25<15
                large = num; //large=25 // large = 25
            }
        }while(num!=0);
        System.out.println("Largest number is "+large);
    }
}
