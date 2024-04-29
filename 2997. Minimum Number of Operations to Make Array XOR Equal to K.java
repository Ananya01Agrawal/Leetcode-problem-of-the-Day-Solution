
class Solution {
    
    public int minOperations(int[] nums, int k) {
        int anan = 0;
        
        for (int num : nums) {
            
            anan ^= num;
        }
        
        int sulti = 0;
        
        k ^= anan; // XOR of elements with k
        
        while (k > 0) {
            sulti += k & 1;
            k >>= 1;
        }
        
        return sulti;
    }
}
