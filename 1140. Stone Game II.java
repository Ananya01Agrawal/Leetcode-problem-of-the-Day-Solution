class Solution {
    Integer[][][] dp = new Integer[2][101][202];
    public int stoneGameII(int[] piles) {
        return helper(0,1,piles,1);
    }
    
    public int helper(int i , int m , int[] piles,int aliceTurn){
      
        if(i == piles.length){
            //base
            return 0;
         }
        
        int ind = i;
        int ans = aliceTurn == 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        int sum = 0;
        
        if(dp[aliceTurn][i][m] != null){
            return dp[aliceTurn][i][m];
        }
        if(aliceTurn==1){
            //alice in turn
            
           for(int x = 1; x <= 2*m && ind < piles.length ;x++){
                   
                     //going with the formula
                     //if i is less than the length
                     sum+=piles[ind];
                     //apply the recursive formula
                    
                     ans = Math.max(ans,
                                   sum + helper(ind+1,Math.max(m,x),piles,0));
                     ind++;
            } 
        }else{
             //alice in turn
            for(int x = 1; x <= 2*m && ind < piles.length ;x++){
                
               //going with the formula
                     //if i is less than the length
                     sum+=piles[ind];
                     //apply the recursive formula but min beacuse bob is also playing optimally so wants alice should come with min value
                     ans = Math.min(ans,
                                    helper(ind+1,Math.max(m,x),piles,1));
                     ind++;
                
            } 
        }
        
        
        return dp[aliceTurn][i][m] = ans;
            
    }
}
