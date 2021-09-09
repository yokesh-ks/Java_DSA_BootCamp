package com.company;

import java.util.Scanner;

// Write a program which will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
// Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail
public class Grades_according_to_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        int mark = input.nextInt();
        String ans = grade(mark);
        System.out.println(ans);
    }

    private static String grade(int mark) {
        if (mark >= 91 && mark <= 100){
            return "AA";
        }
        else if (mark >= 81 && mark <= 90){
            return "AB";
        }
        else if (mark >= 71 && mark <= 80){
            return "BB";
        }
        else if (mark >= 61 && mark <= 70){
            return "BC";
        }
        else if (mark >= 51 && mark <= 60){
            return "CD";
        }
        else if (mark >= 41 && mark <= 50){
            return "DD";
        }
        else if (mark <= 40){
            return "Fail";
        }
        return "Enter a Valid Mark";
    }
}
