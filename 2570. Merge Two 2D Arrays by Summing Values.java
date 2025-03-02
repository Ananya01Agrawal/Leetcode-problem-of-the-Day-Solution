class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] nums = new int[1001];
        
        // Sum values from nums1
        for (int[] n : nums1) {
            nums[n[0]] += n[1];
        }
        
        // Sum values from nums2
        for (int[] n : nums2) {
            nums[n[0]] += n[1];
        }
        
        // Count non-zero entries
        int count = 0;
        for (int n : nums) {
            if (n != 0) count++;
        }
        
        // Build the result array
        int[][] res = new int[count][2];
        int j = 0;
        for (int i = 0; i <= 1000; i++) {
            if (nums[i] != 0) {
                res[j][0] = i;
                res[j][1] = nums[i];
                j++;
            }
        }
        
        return res;
    }
}
