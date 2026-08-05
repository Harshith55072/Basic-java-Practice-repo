package org.tnsif.acc.interviewquestions.arrays;

/**
 * Program 9: Find the largest and smallest element in an array.
 *
 * Approach: single pass, tracking min and max as we go.
 */
public class MinMax {

    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 41, 31, 10, 8};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
