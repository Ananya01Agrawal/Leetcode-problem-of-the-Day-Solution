class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n=nums.length;
        //iterate through the array
        for(int i=0;i<n;i++){
            // Check if any pair of elements' bitwise OR results in a number with trailing zeros (even number)
            for(int j=0;j<n;j++){
                if(i!=j && (nums[i] | nums[j])%2==0){
                    return true; // return true if such a pair is found
                }
            }

        }
        return false;// return false if no such pair found

        
    }
}
