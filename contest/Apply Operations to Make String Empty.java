import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        int[] cap = new int[26];

        for (char ch : s.toCharArray()) {
            
            cap[ch - 'a']++;
        }

        int enough = Arrays.stream(cap).max().getAsInt();

        StringBuilder anan = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            
            char ch = s.charAt(i);
            
            if (cap[ch - 'a'] == enough) {
                
                cap[ch - 'a'] = -1;
                
                anan.insert(0, ch);
            }
        }

        return anan.toString();
    }
}
