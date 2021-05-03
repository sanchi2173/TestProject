package com.java.test;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms to be displayed: ");

        int size = sc.nextInt();

        int num1=0, num2=1;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for(int i=1; i<size-1; i++)
        {
            int sum=0;
            sum = num1 + num2;
            System.out.print(sum + " ");

            num1 = num2;
            num2 = sum;
        }

        System.out.println("Fibonacci series printed successfully.");

    }
}
