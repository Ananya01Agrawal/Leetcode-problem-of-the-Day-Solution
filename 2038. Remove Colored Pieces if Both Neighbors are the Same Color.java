class Solution {
    public boolean winnerOfGame(String s) {
        int counta = 0; //Count of removable A (A 'A' A)
        int countb = 0;  //Count of removable B (B 'B' B)
        
        for(int i=1;i<s.length()-1;i++){
            int curr = s.charAt(i);
            int next = s.charAt(i+1);
            int prev = s.charAt(i-1);
            if(curr=='A' && prev==next && prev==curr){
                counta++;
            }
            if(curr=='B' && prev==next && prev==curr){
                countb++;
            }
        }
        
        return counta>countb?true:false;
    }
}
