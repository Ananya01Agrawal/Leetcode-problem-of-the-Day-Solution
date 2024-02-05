class Solution {
    public int firstUniqChar(String s) {
        // initialize the hashmap
        HashMap<Character,Integer> map=new HashMap<>();

        // if the character exists , its freqeuncy is incremented by 1
        // if the character doesn't exists in the hashmap, it is added by a frequency if 1'

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        // if the frequecny is 1 it means the character is unique, else return -1
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
