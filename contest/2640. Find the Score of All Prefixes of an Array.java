class Solution {
    public long[] findPrefixScore(int[] nums) {
    int n = nums.length;// calculating the length of the array
        
    long[] anu = new long[n]; // creating the array
        
    anu[0] = 2 * nums[0];// multiplying every element of the array woth zero
        
    int maxiarr = nums[0]; // initialising maximum elemnt as zero
    
    for (int i = 1; i < n; i++) {// traversing through the array
        
        if (nums[i] > maxiarr) {// if nums grater than maximum
            
            maxiarr = nums[i];// assign value of nums to maximum
        }
        nums[i] = nums[i] + maxiarr;
        
        anu[i] = nums[i] + anu[i-1];
        
    }
    
    return anu; // returning the answer
    }
}
