class Solution {
    public int diagonalPrime(int[][] nums) {
      int largestPrimeanu = 0; //int calculate the maximum
        
    int n = nums.length;// calculate the length
        
    for (int i = 0; i < n; i++) {
        
        if (isananya(nums[i][i])) {
            
            largestPrimeanu = Math.max(largestPrimeanu, nums[i][i]);
        }
        
        
        if (isananya(nums[i][n - i - 1])) {
            
            largestPrimeanu = Math.max(largestPrimeanu, nums[i][n - i - 1]);
        }
    }
        
        
    return largestPrimeanu;
}

    
    
    private boolean isananya(int num) {
        
        
        if (num <= 1) {// if less than 1
            
            
            return false;// return false
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {// calculating the square
            
            
            if (num % i == 0) {
                
                return false;// return false
            }
        }
        
        
        return true;// return true
        
    }
}
