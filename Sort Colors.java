class Solution {
    public void sortColors(int[] nums) {
        int cntz=0,cnto=0,cntt=0;        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0){
                cntz++;
            } 
            else if(nums[i] == 1){
                cnto++;
            }
            else{
                cntt++;
            }
        }        
        for(int i = 0; i < cntz;i++){
            nums[i]=0;
        }
        for(int i =cntz; i < cntz+cnto;i++){
            nums[i]=1;
        }
        for(int i = cntz+cnto; i <nums.length;i++){
            nums[i]=2;
        }
        
    }
}
