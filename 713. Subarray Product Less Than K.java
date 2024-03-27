class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //sliding window approach to solve the probelm
        int left=0, right=0, count=0;
        int n=nums.length;
        int product=1;
        if(k<=1) return 0;

        while(right<n){
            product*=nums[right];

            while(product>=k){
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;                                                                            
        }
        return count;
    }
}
