class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
            count+=countPallindrome(s,i,i)+countPallindrome(s,i,i+1);
        return count;
    }
    private int countPallindrome(String s , int l, int r){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
            count++;
        }
        return count;
        
    }
}
