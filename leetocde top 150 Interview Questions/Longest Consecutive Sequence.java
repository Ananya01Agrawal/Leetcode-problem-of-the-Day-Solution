class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n<2) return n;

        int result = 1, count = 1;
        Arrays.sort(nums);

        for(int i=1; i<n; i++) {
            if(i<n && nums[i] == nums[i-1] + 1) {
                count++;
            } else if(i<n && nums[i] == nums[i-1]) {
                continue;
            } else {
                result = Math.max(result, count);
                count = 1;
            }
        }
        result = Math.max(result, count);
        return result;
    }
}
