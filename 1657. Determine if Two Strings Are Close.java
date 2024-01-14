class Solution {
    public boolean closeStrings(String word1, String word2) {
        // Check if the lengths of the two words are different
        if (word1.length() != word2.length()) return false;
        
        // Arrays to store the frequency of each character in the words
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // Populate the frequency arrays for each word
       for (int i = 0; i < word1.length(); i++) {
			freq1[word1.charAt(i) - 'a']++;
			freq2[word2.charAt(i) - 'a']++;
		}
        
        // Check if the characters in both words have the same frequencies
        for (int i = 0; i < 26; i++) {
            if (freq1[i] == freq2[i]) {
                freq1[i] = 0;
                freq2[i] = 0;
            } else if (freq1[i] == 0 || freq2[i] == 0) { // if character is present in one but not in another
                return false;
            }
        }
        
        // Sort the frequency arrays
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        // Check if the sorted frequency arrays are the same
        for (int i = 25; i >= 0; i--) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        // If all conditions are met, the words are close strings
        return true;
    }
}
