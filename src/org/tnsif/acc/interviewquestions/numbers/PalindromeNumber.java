package org.tnsif.acc.interviewquestions.numbers;

import java.util.Scanner;

/**
 * Program 2: Check whether a number is a palindrome.
 * A palindrome number reads the same forwards and backwards (e.g. 121, 1331).
 *
 * Approach: reverse the number mathematically (no string conversion)
 * and compare it to the original.
 */
public class PalindromeNumber {

    // Core logic: reverse digits of a number using arithmetic
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        // Negative numbers are not considered palindromes here
        if (number < 0) {
            return false;
        }

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is NOT a palindrome number.");
        }

        sc.close();
    }
}
