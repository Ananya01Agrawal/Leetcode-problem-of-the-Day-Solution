class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[(grid.length * grid.length) + 1];
        int[] ans=new int[2];
        for (int[] i : grid) {
            for (int j : i) {
                res[j] = res[j] + 1;
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==2){
                ans[0]=i;
            }
            if(res[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}
