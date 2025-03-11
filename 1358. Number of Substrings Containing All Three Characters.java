class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int res=0;
        int last[]={-1,-1,-1};
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
            res+=1+Math.min(last[0],Math.min(last[1],last[2]));
        }
        return res;
    }
}
