import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String sortVowels(String s) {
        // Calculate the length of the input string
        int nim = s.length();
        
        // Create a StringBuilder 'tun' to store the vowels from the input string
        StringBuilder tun = new StringBuilder();
        for (int i = 0; i < nim; i++) {
            char ch = s.charAt(i);
            // Check if the character is a vowel and add it to 'tun'
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                tun.append(ch);
            }
        }
        
        // Convert the StringBuilder 'tun' to a List of characters and sort it
        List<Character> sortedVowels = new ArrayList<>();
        for (char ch : tun.toString().toCharArray()) {
            sortedVowels.add(ch);
        }
        Collections.sort(sortedVowels);
        
        // Create a StringBuilder 'anan' to store the final sorted string
        StringBuilder anan = new StringBuilder();
        int j = 0;
        for (int i = 0; i < nim; i++) {
            char ch = s.charAt(i);
            // If the character is a vowel, append the corresponding sorted vowel to 'anan'
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                anan.append(sortedVowels.get(j));
                j++;
            } else {
                // If the character is not a vowel, append it as it is to 'anan'
                anan.append(ch);
            }
        }
        
        // Return the final sorted string
        return anan.toString();
    }
}
