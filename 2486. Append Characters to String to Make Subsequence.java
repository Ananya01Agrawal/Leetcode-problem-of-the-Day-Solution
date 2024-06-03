class Solution {
    public int appendCharacters(String s, String t) {
        int sIndex=0, tIndex=0;
        int n=s.length();
        int m=t.length();
        while(sIndex< n && tIndex<m){
            if(s.charAt(sIndex)==t.charAt(tIndex)){
                tIndex++;
            }
            sIndex++;
        }

        return m-tIndex;
    }
}
