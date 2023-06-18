class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);// sort the array
        
        int anan=Integer.MAX_VALUE;// finding the mininimum value
        
        for(int i=1;i<nums.length;i++){// traverse the array
            
            anan=Math.min(anan,nums[i]-nums[i-1]);// finding the minimu value
        }
        return anan;
        
    }
}
