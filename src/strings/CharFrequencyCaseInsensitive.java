import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Program 8: Count the frequency of each character in a string (case-insensitive).
 * 'A' and 'a' are treated as the same character.
 *
 * Approach: lowercase the string first, then count using a LinkedHashMap.
 */
public class CharFrequencyCaseInsensitive {

    public static Map<Character, Integer> countFrequency(String input) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        String lowerCased = input.toLowerCase();

        for (char c : lowerCased.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Map<Character, Integer> freqMap = countFrequency(input);

        System.out.println("Character frequencies (case-insensitive):");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        sc.close();
    }
}
