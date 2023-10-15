public class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] anan = {-1, -1};
        int n = nums.length;
        int mxin = nums[0];
        int ndx1 = 0;
        int mn = nums[0];
        int ndx2 = 0;
        
        for (int i = indexDifference; i < n; i++) {
            if (nums[i - indexDifference] > mxin) {
                mxin = nums[i - indexDifference];
                ndx1 = i - indexDifference;
            }
            if (nums[i - indexDifference] < mn) {
                mn = nums[i - indexDifference];
                ndx2 = i - indexDifference;
            }
            if (Math.abs(nums[i] - mxin) >= valueDifference) {
                return new int[]{ndx1, i};
            }
            if (Math.abs(nums[i] - mn) >= valueDifference) {
                return new int[]{ndx2, i};
            }
        }
        
        return anan;
    }
}
