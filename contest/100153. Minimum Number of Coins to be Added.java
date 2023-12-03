class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);  
        int currin = 1;
        
        int coinsNeedin = 0;
        
        for (int coin : coins) {
            
            while (coin > currin) {
                
                coinsNeedin += 1;
                
                currin *= 2;
            }
            currin += coin; 
            
            if (currin > target) {  
                
                break;
            }
        }
        
        while (currin <= target) { 
            
            coinsNeedin += 1;
            
            currin *= 2;
        }
        return coinsNeedin;
    }
}
