import java.util.*;

public class Solution {
    public int minimumDeletions(String word, int k) {
        // Initialize a map to store the frequency of each character in the word
        Map<Character, Integer> cum = new HashMap<>();
        for (char c : word.toCharArray()) {
            cum.put(c, cum.getOrDefault(c, 0) + 1);
        }
        
        // Store the anan in a list and sort it in descending order
        ArrayList<Integer> anan = new ArrayList<>();
        for (int value : cum.values()) {
            anan.add(value);
        }
        Collections.sort(anan, Collections.reverseOrder());
        
        // Initialize minimum remove to the maximum possible integer value
        int lessRemove = Integer.MAX_VALUE;
        
        // Iterate through the sorted anan
        for (int i = 0; i < anan.size(); ++i) {
            int goal = anan.get(i);
            int remove = 0;
            
            // Calculate the number of remove required to make the word k-special
            for (int aim : anan) {
                if (aim > goal + k) {
                    remove += aim - (goal + k);
                } else if (aim < goal) {
                    remove += aim;
                }
            }
            
            // Update the minimum remove if necessary
            lessRemove = Math.min(lessRemove, remove);
            
            // Break early if minimum remove is already zero
            if (lessRemove == 0) {
                break;
            }
        }
        
        // Return the minimum remove (or 0 if lessRemove is still the maximum integer value)
        return (lessRemove != Integer.MAX_VALUE) ? lessRemove : 0;
    }
}
