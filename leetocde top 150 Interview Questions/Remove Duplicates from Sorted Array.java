class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[res]){
                
                res++;
                nums[res]=nums[i];
            }
        }
        return res+1;
        
    }
}

//time complexity: o(n)
//space complexity: O(1)
