class Solution {
    public String largestOddNumber(String nums) {
        for(int i=nums.length()-1;i>=0;i--){
            int n=nums.charAt(i);
            if(n%2!=0)
                return nums.substring(0,i+1);
        }
        return "";
    }
}
