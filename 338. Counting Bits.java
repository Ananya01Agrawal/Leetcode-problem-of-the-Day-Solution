class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            // depending on whetehr i is even or not we get 0 and 1
            ans[i]=ans[i/2]+i%2;
        }
        return ans;
        
    }
}
