class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int countT=0;
        int countF=0;
        for(int i=0;i<answerKey.length();i++){
            if(answerKey.charAt(i)=='F'){
                countF++;
            }
            else{
                countT++;
            }
            if(countF<=k || countT<=k){
                max=Math.max(max,countT+countF);
            }
            else{
                while(countF>k && countT>k){
                    char ch=answerKey.charAt(left++);
                    if(ch=='F'){
                        countF--;
                    }
                    else{
                        countT--;
                    }
                }
            }
        }
        return max;
        
    }
}
