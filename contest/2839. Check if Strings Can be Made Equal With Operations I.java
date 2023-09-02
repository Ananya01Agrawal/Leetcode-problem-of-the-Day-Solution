import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canBeEqual(String s1, String s2) {
        // Check if the strings are already equal
        if (s1.equals(s2)) {
            return true;
        }

        int n = s1.length();

        // Create a HashMap to count the occurrences of characters
        Map<Character, Integer> hm = new HashMap<>();

        // Count character occurrences in both strings
        for (int i = 0; i < n; i++) {
            // Increment count for s1 character, decrement count for s2 character
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
            hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0) - 1);
        }

        // Check if the character counts are all zero
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() != 0) {
                return false; // If not all counts are zero, the strings cannot be equal
            }
        }

        // Check if the strings can be made equal by swapping characters
        for (int i = 0; i < n - 2; i++) {
            if (s1.charAt(i) == s2.charAt(i + 2) && s1.charAt(i + 2) == s2.charAt(i)) {
                return true; // If the condition is met, the strings can be made equal
            }
        }

        return false; // If no conditions are met, the strings cannot be made equal
    }
}
