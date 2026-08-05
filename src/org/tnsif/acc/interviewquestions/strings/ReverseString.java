package org.tnsif.acc.interviewquestions.strings;

import java.util.Scanner;

/**
 * Program 1: Reverse a string WITHOUT using any built-in reverse methods
 * (no StringBuilder.reverse(), no Collections.reverse(), etc.)
 *
 * Approach: swap characters from both ends of a char array moving inward.
 */
public class ReverseString {

    // Core logic: reverse using a char array and two-pointer swap
    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = reverse(input);

        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
