import java.util.*;

 class Solution {
     
    public int missingInteger(int[] nums) {
        
        Map<Integer, Integer> calc = new HashMap<>();
        
        for (int num : nums) {
            
            calc.put(num, calc.getOrDefault(num, 0) + 1);
        }
        
        int j = 1;
        
        int tot = nums[0];
        
        for (; j < nums.length; j++) {
            
            if (nums[j] == nums[j - 1] + 1) {
                
                tot += nums[j];
                continue;
            }
            break;
        }
        
        while (calc.containsKey(tot)) {
            
            tot++;
        }
        return tot;
    }
}
