class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        
        int[] anu = new int[grid[0].length];// initilsising the 2 d array
        
        
        for (int i = 0; i < grid.length; i++) {// traversing through the row
            
            
            
            for (int j = 0; j < grid[0].length; j++) {// traversing through the column
                
                
                int len = String.valueOf(grid[i][j]).length();// calculating the length
                
                
                anu[j] = Math.max(anu[j], len);// returning the maximum length
            }
        }
        
        
        return anu;// returning the length
    }
}
  
