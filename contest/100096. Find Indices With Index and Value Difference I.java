public class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] anan = {-1, -1};// initially put -1 and -1 into the array
        
        for (int i = 0; i < nums.length; i++) {// traverse through the array
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {// applyingt he condition
                    
                    anan[0] = i;
                    anan[1] = j;
                    
                    return anan;
                }
            }
        }
        
        return anan;
    }
}
