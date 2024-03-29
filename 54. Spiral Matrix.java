class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res= new ArrayList<>();// creating the new array list
        if(matrix.length==0){// if length of teh matrix is zero
            return res;
        }

        int rowBegin=0;
        int rowEnd=matrix.length-1;
        int colBegin=0;
        int colEnd=matrix[0].length-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){
            // Traverse Right
            for(int j=colBegin; j<=colEnd; j++){
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            //Traverse down

            for(int j=rowBegin; j<=rowEnd; j++){
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if(rowBegin<=rowEnd){
                //Traverse left
                for(int j=colEnd;j>=colBegin;j--){
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if(colBegin<=colEnd){
                //Traverse up
                for(int j=rowEnd; j>=rowBegin;j--){
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }
        return res;

        
    }
}
