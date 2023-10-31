class Solution {
    public int[] findArray(int[] pref) {
        int ans[]=new int[pref.length];
        int sum=0;
        for(int i=0;i<pref.length;i++){
            ans[i]=sum^pref[i];
            sum^=ans[i];
        }
        return ans;
    }
}
