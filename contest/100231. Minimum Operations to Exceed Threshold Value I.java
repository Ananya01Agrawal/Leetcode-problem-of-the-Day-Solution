class Solution {
    public int minOperations(int[] nums, int kim) {
        
        Arrays.sort(nums);//sorting the array
        
         int anan=-1;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>=kim){
                
                anan=i;
            break;
            }
                
            
        }
        return anan;
    }
}
