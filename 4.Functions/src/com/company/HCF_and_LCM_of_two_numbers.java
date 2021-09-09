package com.company;


import java.util.Scanner;

public class HCF_and_LCM_of_two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number-1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the number-2 : ");
        int num2 = input.nextInt();
        int ans1= HCF(num1, num2);
        System.out.println("HCF of Two NUmber is "+ans1);
        int ans2 = LCM(num1, num2);
        System.out.println("LCM of Two NUmber is "+ans2);
    }

    public static int HCF(int num1, int num2){
        while(num2%num1!=0){
            int rem = num2%num1;
            num2 = num1;
            num1 = rem;
        }
        return num1;
    }

    public static int LCM(int num1, int num2){
        int HCF = HCF(num1, num2);
        int LCM = num1*num2/HCF;
        return LCM;
    }
}
