class Solution {
    public int longestSubarray(int[] nums) {
        // Initialize variables to track the maximum value, current count of max values, and max count of consecutive max values.
        int max = 0, count = 0, maxcount = 0;
        
        // First loop to find the maximum value in the array.
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);  // Update 'max' if a higher value is found.
        }
        
        // Second loop to find the length of the longest subarray containing only the maximum value.
        for(int i = 0; i < nums.length; i++) {
            if(max == nums[i]) {
                count++;  // Increment the count if the current element equals the maximum value.
            } else {
                maxcount = Math.max(maxcount, count);  // Update 'maxcount' if the current count is greater.
                count = 0;  // Reset count when a different value is encountered.
            }
        }
        
        // Update 'maxcount' one last time in case the longest subarray ends at the last element.
        maxcount = Math.max(maxcount, count);
        
        // If no subarray was found, return 1. Otherwise, return the length of the longest subarray.
        if(maxcount == 0) {
            return 1;
        }
        return maxcount;
    }
}
