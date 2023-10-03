class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0; // Initialize a variable to keep count of identical pairs.

        // Create an array to store the frequency of each number, assuming numbers in the range 0 to 100.
        int[] fcount = new int[101];

        // Iterate through each number in the input array 'nums'.
        for (int num : nums) {
            fcount[num]++; // Increment the count for the current number in the 'fcount' array.
        }

        // Iterate through the frequency array 'fcount'.
        for (int i : fcount) {
            // Calculate the number of pairs that can be formed using 'i' identical elements.
            // The formula for this is (i * (i - 1)) / 2.
            // Add this count to the 'count' variable.
            count += ((i) * (i - 1)) / 2;
        }

        // Return the total count of identical pairs.
        return count;
    }
}
