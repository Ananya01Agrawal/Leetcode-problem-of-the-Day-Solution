class Solution {
    public static int addMinimum(String s) {
        
    int i = 0;// intiilising the index as zero
        
    char ch = 'a';
        
    int countin = 0;
        
    
    while (i < s.length()) {// calculating the string length
        
        if (s.charAt(i) == ch) {// if 
            
            i++;
        } 
        else {
            
            countin++;
        }
        
        if (ch == 'a') {
            
            ch = 'b';
            
        } else if (ch == 'b') {
            
            ch = 'c';
            
        } else {
            
            
            ch = 'a';
        }
    }
    
    if (s.charAt(s.length() - 1) == 'a') {
        
        countin += 2;// increase the count by 2
    } 
        else if (s.charAt(s.length() - 1) == 'b') {
            
        countin++;// increase the count by plus plus
    }
    
    return countin;
    }
}
