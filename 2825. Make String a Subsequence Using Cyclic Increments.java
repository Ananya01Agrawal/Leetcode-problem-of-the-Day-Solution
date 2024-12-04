class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        // Certainly, the given code might be inefficient for larger inputs because it involves a lot of string manipulation using substring operations, which can result in time complexity issues. To optimize the code, you can use a StringBuilder to handle string modifications more efficiently. 
        
        if (len1 < len2) return false;
        
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder(str1); // Convert the first string to StringBuilder
        
        while (i < len1 && j < len2) {
            if (sb.charAt(i) == str2.charAt(j)) {
                j++;
            } else {
                char newChar = sb.charAt(i) != 'z' ? (char)(sb.charAt(i) + 1) : 'a';
                sb.setCharAt(i, newChar);
                
                if (newChar == str2.charAt(j)) {
                    j++;
                }
            }
            i++;
        }
        
        return j == len2;
    }
}
