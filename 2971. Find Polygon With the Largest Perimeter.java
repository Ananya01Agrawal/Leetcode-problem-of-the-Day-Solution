class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        long tempSum = nums[0] + nums[1] + nums[2], sum = -1;
        
        if(nums[0] + nums[1] > nums[2]){
            sum = tempSum;
        }
        for(int i = 3; i < nums.length; i++) {
            if(tempSum > nums[i]) {
                tempSum += nums[i];
                sum = tempSum;
            }
            else{
                tempSum += nums[i];
            }
            
        }
        
        return sum;
        
    }
}
