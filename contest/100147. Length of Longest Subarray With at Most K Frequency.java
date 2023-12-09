import java.util.HashMap;
import java.util.Map;

 class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        int i = 0;
        int ansin = 0;
        
        Map<Integer, Integer> mpin = new HashMap<>();
        
        for (int j = 0; j < nums.length; j++) {
            
            if (!mpin.containsKey(nums[j])) {
                
                mpin.put(nums[j], 1);
            } else {
                
                mpin.put(nums[j], mpin.get(nums[j]) + 1);
            }
            
            if (mpin.get(nums[j]) > k) {
                
                while (j >= i && mpin.get(nums[j]) > k) {
                    
                    mpin.put(nums[i], mpin.get(nums[i]) - 1);
                    
                    if (mpin.get(nums[i]) == 0) {
                        
                        mpin.remove(nums[i]); // Remove the element if its count becomes zero
                    }
                    i++;
                }
            }
            
            ansin = Math.max(ansin, j - i + 1);
        }
        
        return ansin;
    }
}
