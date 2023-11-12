class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int maxi=0;
        int nuv=nums.length;
        for(int i=0;i<nuv;i++){
            for(int j=i+1;j<nuv;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    int res=nums[i]^nums[j];
                    maxi=Math.max(maxi,res);
                }
            }
        }
        return maxi;
    }
}
