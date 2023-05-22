class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);// sort the array
        return nums[nums.length/2];
        
    }
}
