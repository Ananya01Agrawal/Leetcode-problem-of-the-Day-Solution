class Solution {
    // Method to check if two characters are adjacent or equal
    private boolean isAdj(char char_1, char char_2) {
        // Check if the characters are equal
        if (char_1 == char_2) {
            return true;
        }
        // Check if the characters are consecutive in ASCII order
        if (char_1 + 1 == char_2 || char_1 == char_2 + 1) {
            return true;
        }
        // If neither condition is met, return false
        return false;
    }

    // Method to count the number of almost equal characters in the word
    public int removeAlmostEqualCharacters(String word) {
        // Get the length of the input word
        int n = word.length();

        // Initialize count variable for almost equal characters
        int cnting = 0;
        int i = 0;

        // Iterate through the word to check for almost equal characters
        while (i < n - 1) {
            // If two characters are almost equal, increment count and move to the next character
            if (isAdj(word.charAt(i), word.charAt(i + 1))) {
                cnting++;
                i++;
            }
            // Move to the next pair of characters
            i++;
        }

        // Return the count of almost equal characters
        return cnting;
    }
}
