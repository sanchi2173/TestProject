package com.java.test;

import java.util.Scanner;

public class Factorial {

    static int fact = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Fact(num);
        System.out.println("Factorial using recursion is " + RecursiveFact(num));
    }

    private static void Fact(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);

    }

    private static int RecursiveFact(int number) {
        if (number != 0) {
            fact = number * RecursiveFact(number-1);
        }
        return fact;
    }
}


