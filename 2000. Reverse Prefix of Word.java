class Solution {
    public String reversePrefix(String word, char ch) {
        int pivot=word.indexOf(ch);
        char[] res=word.toCharArray();
        int start=0;
        int end=pivot;
        while(start<end){
            char temp=res[start];
            res[start]=res[end];
            res[end]=temp;
            start++;
            end--;
        }
        return new String(res);
    }
}
/*
Approach
Find the index of chchch using indexOf()indexOf()indexOf() method.
Convert the string into a character array.
Reverse the elements of the array upto the targettargettarget index.
Return the array as a string.
*/
