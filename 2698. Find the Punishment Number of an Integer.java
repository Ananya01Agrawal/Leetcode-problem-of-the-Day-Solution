class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for(int i = 1 ; i <= n ;i++){
            String curr = "";
            curr = curr + i*i;
            if(h(curr , 0 , i)){
                ans+= i*i;
                
            }

        }
        return ans;
   
    }
    public static boolean h(String s ,int sum , int target){
        if(s.isEmpty() && sum==target){
            return true;
        }
       for(int i = 0 ; i < s.length();i++){
        String curr = s.substring(0 , i+1);
        String left = s.substring(i+1);
        int add = Integer.parseInt(curr);
        if(add>target){
            break;
        }
       if(h(left , sum +add ,target)){
        return true;
       }


        
       }
       return false;

    }
}
