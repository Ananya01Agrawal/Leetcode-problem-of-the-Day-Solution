import java.util.*;

class Solution {
    public int[][] modifiedMatrix(int[][] arr) {
        
        int aru = arr.length;//no of rows
        
        int acu = arr[0].length;//no of coumns

        int[] maxiValue = new int[acu];
        
        Arrays.fill(maxiValue, Integer.MIN_VALUE);

        for (int j = 0; j < acu; ++j) {
            
            for (int i = 0; i < aru; ++i) {
                
                if (arr[i][j] > maxiValue[j]) {
                    
                    maxiValue[j] = arr[i][j];
                }
            }
        }

         // Iterate through each element in the array
        for (int i = 0; i < aru; ++i) {
            for (int j = 0; j < acu; ++j) {
                  // Replace any element with value -1 with the maximum value in its column
                if (arr[i][j] == -1) {
                    
                    arr[i][j] = maxiValue[j];
                }
            }
        }
        
        // Return the modified array

        return arr;
    }
}
