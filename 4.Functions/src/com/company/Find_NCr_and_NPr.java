package com.company;

import java.util.Scanner;

// Find Ncr & Npr
// nPr = n!/(n-r)!
// nCr = n!/r!(n-r)!
// n = total number of things
// r = number of things to be chosen out of n things
public class Find_NCr_and_NPr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Things : ");
        int n = input.nextInt();
        System.out.print("Enter the number of Things to be chosen : ");
        int r = input.nextInt();
        int a = n-r;
        nCr(n, r, a);
        nPr(n, a);
    }

    public static int nCr(int n, int r, int a){
        // nCr = n!/r!(n-r)!
        int nCr = n(n)/(r(r)*a(a));
        System.out.println("nCr = "+nCr);
        return nCr;
    }

    public static int nPr(int n, int a){
        // nPr = n!/(n-r)!
        int nPr = n(n)/a(a);
        System.out.println("nPr = "+nPr);
        return nPr;
    }

    public static int n(int n){
        int ans = 1;
        while(n!=0){
            ans = ans * n;
            n--;
        }
        return ans;
    }

    public static int r(int r){
        int ans = 1;
        while(r!=0){
            ans = ans * r;
            r--;
        }
        return ans;
    }

    public static int a(int a){
        int ans = 1;
        while(a!=0){
            ans = ans * a;
            a--;
        }
        return ans;
    }
}
