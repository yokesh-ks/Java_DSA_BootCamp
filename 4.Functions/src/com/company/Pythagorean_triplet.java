package com.company;

import java.util.Scanner;

// Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two number is equal to the
// square of the third number).
public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side-1 of Triplet : ");
        int side1 = input.nextInt();
        System.out.print("Enter the Side-2 of Triplet : ");
        int side2 = input.nextInt();
        System.out.print("Enter the Side-3 of Triplet : ");
        int side3 = input.nextInt();
        String ans = Pythagorean(side1, side2, side3);
        System.out.print(ans);
    }

    public static String Pythagorean(int side1, int side2, int side3){
        if ((side1 * side1) + (side2 * side2) == (side3 * side3)){
            return "It is a Pythagoream Triplet";
        }
        return "It is a not Pythagoream Triplet";
    }
}
