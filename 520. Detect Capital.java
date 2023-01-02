class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;//count the number of upper case letters
        for(char ch:word.toCharArray()){
            //convert the string to array
            //count the no of upper case characters in teh array
            if(Character.isUpperCase(ch)) count++;


        }
        //if the no of upper case caharcters is equal to the length of the word of the string it means all letter are in upper case while if the count is zero it means the whole string is in lower case
        if(count==word.length()||count==0) return true;
        //if only one letter is in upper case character 
        else if(count==1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }
}

//Another solution
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.matches("[A-Z]*"))
            return true;
        else if(word.matches("[a-z]*"))
            return true;
        else if(word.matches("[A-Z]{1}|.[a-z]*"))
            return true;
        else
            return false;
        
    }
}
