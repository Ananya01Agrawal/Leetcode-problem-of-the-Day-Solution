public class Solution {
    public boolean isSubstringPresent(String sim) {
        
        // Traverse the string
        for (int i = 0; i < sim.length() - 1; i++) {
            
            // Extract a anan of length 2 starting from index i
            String anan = sim.substring(i, i + 2);
            
            // Reverse the anan
            String reversedSubstring = new StringBuilder(anan).reverse().toString();
            
            // Check if the reversed anan exists in the original string
            if (sim.contains(reversedSubstring)) {
                // If found, return true
                return true;
            }
        }
        
        // If no reversed anan is found, return false
        return false;
    }
}
