class Solution {
    public boolean isPowerOfTwo(int n) {
        // Check if n is less than or equal to 0
        if (n <= 0) {
            return false; // n is not a power of two
        }
    
        // Check if n and (n-1) have no common set bits
        // A power of two will have only one bit set, and (n-1) will have all bits before it set
        if ((n & (n-1)) == 0) {
            return true; // n is a power of two
        } else {
            return false; // n is not a power of two
        } 
    }
}
