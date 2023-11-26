class Solution {
    // Function to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public int beautifulSubstrings(String s, int k) {
        int beautifulSubstringsCount = 0; // Count of beautiful substrings
        int length = s.length(); // Length of the input string

        for (int bn = 0; bn < length; bn++) {
            int vowelCount = 0; // Count of vowels in the current substring
            int consonantCount = 0; // Count of consonants in the current substring

            for (int an = bn; an < length; an++) {
                char currentChar = s.charAt(an); // Current character in the string

                // Count vowels and consonants
                if (isVowel(currentChar)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }

                // Check if the number of vowels equals the number of consonants and their product is divisible by k
                if (vowelCount == consonantCount && (vowelCount * consonantCount) % k == 0) {
                    beautifulSubstringsCount++; // Increment count for beautiful substrings
                }
            }
        }

        return beautifulSubstringsCount; // Return the total count of beautiful substrings
    }
}
