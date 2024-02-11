class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        
        int nim = nums.length;
        
        int mun = pattern.length;
        
        int calc = 0;

        for (int i = 0; i <= nim - mun-1; ++i) {
            
            boolean anan = true;
            
            for (int j = 0; j < mun; ++j) {
                
                if ((pattern[j] == 1 && nums[i + j + 1] <= nums[i + j]) ||
                    (pattern[j] == 0 && nums[i + j + 1] != nums[i + j]) ||
                    (pattern[j] == -1 && nums[i + j + 1] >= nums[i + j])) {
                    
                    anan = false;
                    
                    break;
                }
            }
            if (anan) {
                
                ++calc;
            }
        }

        return calc;
    }
}
