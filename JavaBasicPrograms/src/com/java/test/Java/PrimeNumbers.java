package com.java.test.Java;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want to do? Select option 1 or 2.");
        System.out.println("1. Get all prime numbers smaller than than a given number.");
        System.out.println("2. Let me know if a number is prime or not.");
        int option = sc.nextInt();
        int num;

        switch (option) {
            case 1:
                System.out.println("Enter a number and we will let you know all prime numbers coming before this number?");
                num = sc.nextInt();
                for (int j = 2; j <= num; j++) {
                    boolean primeFlag = IsPrime(j);
                    if (primeFlag) {
                        System.out.print(j);
                        System.out.print(" ");
                    }
                }
                break;

            case 2:
                System.out.println("Enter a number and we will let you know if it is a prime number?");
                num = sc.nextInt();
                boolean primeFlag = IsPrime(num);
                if (primeFlag)
                    System.out.println("Hurray !!! Num " + num + " is a PRIME number.");
                else
                    System.out.println("Num " + num + " is NOT a PRIME number.");
                break;

            default:
                System.out.println("Incorrect option selected " + option);
        }

    }


    private static boolean IsPrime(int inputNumber) {
        boolean primeFlag = false;

        for (int i = 2; i <= inputNumber; i++) {
            if (inputNumber == i) {
                primeFlag = true;
            } else if (inputNumber % i == 0) {
                break;
            }
        }
        return primeFlag;
    }




}
