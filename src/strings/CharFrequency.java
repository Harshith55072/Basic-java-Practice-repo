import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Program 5: Count the frequency of each character in a string.
 * (Case-sensitive version — see CharFrequencyCaseInsensitive for #8)
 *
 * Approach: use a LinkedHashMap to preserve first-seen order while counting.
 */
public class CharFrequency {

    public static Map<Character, Integer> countFrequency(String input) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Map<Character, Integer> freqMap = countFrequency(input);

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        sc.close();
    }
}
