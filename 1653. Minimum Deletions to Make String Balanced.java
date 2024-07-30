class Solution {
    public int minimumDeletions(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b')
                break;
        }
        int counta=0;
        int countb=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                counta++;
            }
            else{
                countb++;
            }
            counta=Math.min(counta,countb);
        }
        return counta;
    }
}
//Time complexxity:O(n)
