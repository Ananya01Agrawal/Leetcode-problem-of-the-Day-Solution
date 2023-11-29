public class Solution {
    public int hammingWeight(int n) {
        int c = 0;  // Initialize a variable 'c' to count the set bits to 0.
        while (n != 0) { // Continue the loop until n becomes 0.
            n = (n & (n - 1)); // Clear the rightmost set bit in n and store it back in n.
            c++; // Increment the count 'c' as you clear each set bit.
        }
        return c; // Return the final count of set bits.
    }
}
