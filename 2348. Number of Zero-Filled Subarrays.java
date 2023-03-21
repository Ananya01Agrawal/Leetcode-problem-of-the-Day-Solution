class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int start = 0, curr = 1;
        long res = 0;
        while(curr < nums.length){
            if(nums[curr] != 0 && nums[curr-1] == 0){
                long length = curr - start;
                res += length*(length+1)/2;
                start = curr+1;
            } else if(nums[curr] != 0 && nums[curr-1] != 0) {
                start = curr+1;
            } else if(nums[curr] == 0 && nums[curr-1] != 0){
                start = curr;
            }
            curr++;
        }
        if(nums[curr-1] == 0){
            long length = curr - start;
            res += length*(length+1)/2;
        }
        return res;
        
    }
}
