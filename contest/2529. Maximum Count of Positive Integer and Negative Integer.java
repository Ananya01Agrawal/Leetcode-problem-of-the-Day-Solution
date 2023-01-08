class Solution {
    public int maximumCount(int[] nums) {   
        int countplus=0;
        int countminus=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                countplus++;
            }
            if(nums[i]<0){
                countminus++;
            }
        }
        if(countplus>countminus){
            max=countplus;
        }
        else{
            max=countminus;
        }
        return max;
    }
}
