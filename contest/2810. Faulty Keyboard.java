class Solution {
    public String finalString(String s) {
        StringBuilder anan=new StringBuilder();// make a astringBuilder
        for(int i=0;i<s.length();i++){// traversing through the string
            if(s.charAt(i)=='i'){// check if it reach teh character i
                anan.reverse();// then reverse teh array
                
            }
            else{
                anan.append(s.charAt(i));// otherwise append into the array
                
            }
        }
        return anan.toString();// converting the stringBuilder to String
        
    }
}
