class Solution {
    public int isPrefixOfWord(String sen, String search) {
        String[]ans=sen.split(" ");
        for(int i=0;i<ans.length;i++){
            if(ans[i].startsWith(search)){
                return i+1;
            }
        }
        return -1;
    }
}
