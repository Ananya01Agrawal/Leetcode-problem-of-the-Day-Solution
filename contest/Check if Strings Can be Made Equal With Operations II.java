class Solution {
    public boolean checkStrings(String s1, String s2) {
           
          int even1[] = new int[26];
          int even2[] = new int[26];
          int odd1[]  = new int[26];
          int odd2[]  = new int[26];
          
        for(int i=0;i<s1.length();i++)
        {
             char ch =s1.charAt(i);
             char ch2 =s2.charAt(i);
            
             if(i%2==0) {
                 even1[ch-'a']+=1;
                 even2[ch2-'a']+=1;
             }
             else{
                  odd1[ch-'a']+=1;
                  odd2[ch2-'a']+=1;
             }
        }
        
        for(int i =0;i<26;i++)
        {
            if(even1[i]!=even2[i] || (odd1[i]!=odd2[i]))    return false; 
        }
        return true;
        
    }
}
