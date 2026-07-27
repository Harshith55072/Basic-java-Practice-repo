import java.util.Scanner;

/**
 * Program 3: Check if a string is a palindrome.
 * e.g. "madam", "racecar" read the same forwards and backwards.
 *
 * Approach: two-pointer comparison from both ends (case-insensitive).
 */
public class PalindromeString {

    public static boolean isPalindrome(String input) {
        String cleaned = input.toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}
