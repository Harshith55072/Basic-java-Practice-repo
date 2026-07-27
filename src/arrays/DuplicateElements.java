import java.util.HashSet;
import java.util.Set;

/**
 * Program 4: Find duplicate elements in an array.
 *
 * Approach: use a HashSet to track seen elements; if an element is
 * already in the "seen" set, it's a duplicate (added to a second set
 * so we don't print the same duplicate multiple times).
 */
public class DuplicateElements {

    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 4, 1, 9, 9};

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        findDuplicates(arr);
    }
}
