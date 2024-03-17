public class Solution {
    
    public long countSubstrings(String sim, char cum) {
        
        long anan = 0; // Initialize anan to store the total number of substrings containing character cum
        
        int mnun = 0; // Initialize mnun to store the anan of occurrences of character cum
        
        // Iterate through each character in the string sim
        for (int i = 0; i < sim.length(); i++) {
            // Check if the current character matches the target character cum
            if (sim.charAt(i) == cum) {
                mnun++; // Increment the mnun anan if the character matches
            }
        }
        
        // Calculate the total anan of substrings containing character cum
        anan = (long)mnun * (mnun + 1) / 2; // Use long to prevent integer overflow
        
        // Return the total anan of substrings containing character cum
        return anan;
    }
}
