package org.tnsif.acc.interviewquestions.numbers;

import java.util.Scanner;

/**
 * Program 10: Print the Fibonacci series up to N terms.
 * Series: 0, 1, 1, 2, 3, 5, 8, 13, ...
 * (each number is the sum of the two preceding ones)
 *
 * Approach: iterative, using two variables to track the last two terms.
 */
public class Fibonacci {

    public static void printFibonacci(int n) {
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series (" + n + " terms): ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}
