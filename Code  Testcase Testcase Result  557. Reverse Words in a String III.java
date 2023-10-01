class Solution {
    // This method takes a string 's' as input and reverses each word in it.
    public String reverseWords(String s) {
        // Split the input string into an array of words using space as the delimiter.
        String[] words = s.split(" ");
        
        // Create a StringBuilder to store the result.
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word in the array.
        for (String word : words) {
            // Create a new StringBuilder to reverse the current word.
            StringBuilder reversedWord = new StringBuilder(word);
            
            // Reverse the characters in the word.
            reversedWord.reverse();
            
            // Append the reversed word to the result StringBuilder, followed by a space.
            result.append(reversedWord).append(" ");
        }
        
        // Convert the result StringBuilder to a string and remove the trailing space.
        return result.toString().trim();
    }
}
