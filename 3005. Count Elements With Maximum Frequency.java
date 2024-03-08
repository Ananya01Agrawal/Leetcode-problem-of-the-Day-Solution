class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> freq = new HashMap<>();
        // Initialize a variable to keep track of the maximum frequency
        int maxFreq = 0;
        
        // Iterate through the array to calculate the frequency of each element
        for (int num : nums) {
            // Update the frequency of the current element in the HashMap
            int newFreq = freq.getOrDefault(num, 0) + 1;
            freq.put(num, newFreq);
            // Update the maximum frequency if needed
            maxFreq = Math.max(maxFreq, newFreq);
        }
        
        int count = 0; // Initialize a variable to count the elements with maximum frequency
        
        // Iterate through the array again to count elements with maximum frequency
        for (int num : nums) {
            // If the frequency of the current element equals the maximum frequency, increment the count
            if (freq.get(num) == maxFreq) {
                count++;
            }
        }
        
        // Return the count of elements with maximum frequency
        return count;
    }
}
