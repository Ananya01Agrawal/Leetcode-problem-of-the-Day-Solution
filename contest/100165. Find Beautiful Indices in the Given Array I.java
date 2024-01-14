import java.util.*;

class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        
        // Initialize a list to store beautiful indices
        
        List<Integer> anan = new ArrayList<>();

        // Get the length of the input string 's'
        
        int n = s.length();

        // Store the indices of occurrences of string 'b' in 's'
        
        List<Integer> bnan = new ArrayList<>();
        
        for (int i = 0; i <= n - b.length(); i++) {
            
            // Check if substring starting at index 'i' and ending at 'i + b.length()' is equal to 'b'
            if (s.substring(i, i + b.length()).equals(b)) {
                
                // If true, add the index 'i' to the list of 'b' indices
                bnan.add(i);
            }
        }

        // Check for beautiful indices of string 'a' in 's'
        for (int i = 0; i <= n - a.length(); i++) {
            
            // Check if substring starting at index 'i' and ending at 'i + a.length()' is equal to 'a'
            if (s.substring(i, i + a.length()).equals(a)) {
                
                // Iterate through the list of 'b' indices
                for (int j : bnan) {
                    
                    // Check if the absolute difference between indices of 'a' and 'b' is less than or equal to 'k'
                    if (Math.abs(i - j) <= k) {
                        
                        // If true, add the index 'i' to the list of beautiful indices and break the loop
                        anan.add(i);
                        
                        break;
                    }
                }
            }
        }

        // Return the list of beautiful indices
        return anan;
    }
}
