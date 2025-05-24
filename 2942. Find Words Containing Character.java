class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // Get the length of the input array
        int n = words.length;
        
        // Initialize an ArrayList to store the indices of words containing the character 'x'
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        // Iterate through each word in the input array
        for (int i = 0; i < n; i++) {
            // Check if the current word contains the character 'x'
            // indexOf returns the index of the first occurrence of 'x' in the word
            // If 'x' is not found in the word, indexOf returns -1
            if (words[i].indexOf(x) != -1) {
                // If 'x' is present in the word, add the index of this word to the list
                ans.add(i);
            }
        }
        
        // Return the list of indices where the character 'x' was found in words
        return ans;
    }
}
