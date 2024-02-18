class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int anan=0;// to count no of count how many prefixes and suffixes are there
        for(int i=0;i<words.length;i++){
            
            for(int j=i+1;j<words.length;j++){
                if(checkPrefixSuffix(words[i],words[j])){//create the function to check whether prefixes and suffixxes are present in the array
                    anan++;
                }
            }
        }
        return anan;
    }
    
    private boolean checkPrefixSuffix(String aim1, String aim2){
        int che1=aim1.length();
        int che2=aim2.length();
        if(che1>che2){
            return false;
        }
        
        // check if aim2 string is a prefix of aim1 string
        if(aim2.startsWith(aim1)){
            return aim1.equals(aim2.substring(che2-che1));
        }
        return false;
    }
}
    
        
        
