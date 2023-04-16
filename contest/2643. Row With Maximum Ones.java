class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int maxione = 0;// initialize maximum as zero
        
        int rowin = 0;// intiialize row as zero
        
        for(int i = 0; i < mat.length; i++){
            
            int countin = 0;// initlize the count as zero
            
            for(int j = 0; j < mat[i].length; j++){
                
                if(mat[i][j] == 1){// if we git the value as 1
                    
                    countin++;// increment the count
                }
            }
            // putting the condition
            
            if(countin > maxione){// if count greater than the maximum value
                
                maxione = countin;// make maximum equal to the count
                
                
                rowin = i;
            }
        }
        
        return new int[]{rowin, maxione};
    }
}
 
