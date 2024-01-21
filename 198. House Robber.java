class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        // if there is no house
        if(nums==null || n==0)
            return 0;
        // if there is only one house
        if(n==1) return nums[0];
        // if there is two house
        if(n==2) return Math.max(nums[0],nums[1]);
        // create a dp array
        int dp[]= new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        // we start stealing form the third house
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];      
    }
}
