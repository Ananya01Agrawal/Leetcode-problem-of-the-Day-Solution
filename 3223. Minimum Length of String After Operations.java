import java.util.HashMap;

class Solution {
    public int minimumLength(String sim) {
        // Create a HashMap to count the frequency of each character
        
        
        HashMap<Character, Integer> anan = new HashMap<>();
        
        
        int anyi = sim.length();

        // Iterate over each character in the string
        for (int i = 0; i < sim.length(); i++) {
            
            
            char cim = sim.charAt(i);
            
            
            anan.put(cim, anan.getOrDefault(cim, 0) + 1);

            // If the frequency of the character is greater than 2
            
            if (anan.get(cim) > 2) {
                
                
                anan.put(cim, 1); // Reset the frequency to 1
                
                
                anyi -= 2; // Decrease the answer by 2
            }
        }
        return anyi;
    }

   
}

