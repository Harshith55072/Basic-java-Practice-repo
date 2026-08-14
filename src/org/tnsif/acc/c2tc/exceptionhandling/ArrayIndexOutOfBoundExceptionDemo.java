package org.tnsif.acc.c2tc.exceptionhandling;

public class ArrayIndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[4]; // 4 positions, valid index range: 0 to 3

        try {
            int i = arr[5];
            System.out.println(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
