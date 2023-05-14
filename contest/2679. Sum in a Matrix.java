class Solution {
    public int matrixSum(int[][] ananya) {
       for(int i[]:ananya){
           //sort the gievn array
           
           Arrays.sort(i);
           
       }
       //initialise answer to zero
        
       int divya = 0;
    // traversing through the array
        
       for(int j=0;j<ananya[0].length;j++){
           
           int mom = -1;
           
           //Traverse the each row one by one
           
           for(int row[]:ananya){
               
               // while doing the comparison we have to match the pattern 
               //in every jth comparsion we take jth element of the row
               
               mom = Math.max(mom,row[j]);// find the maximum
           }
           divya += mom;
       }

       return divya;

       }
    }
