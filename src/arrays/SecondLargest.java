/**
 * Program 7: Find the second largest element in an array WITHOUT sorting.
 *
 * Approach: single pass, tracking the largest and second-largest
 * values seen so far.
 */
public class SecondLargest {

    public static Integer findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return null; // not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return null; // all elements were equal, no distinct second largest
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 41, 31, 10, 8};

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        Integer result = findSecondLargest(arr);

        if (result == null) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + result);
        }
    }
}
