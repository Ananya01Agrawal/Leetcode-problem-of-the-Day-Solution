class Solution {
    public String compressedString(String word) {
       StringBuilder anan = new StringBuilder();
        int nim = word.length();
        int i=0;
        int gho = 0;

        while (i < nim) {
            char res = word.charAt(i);
            int cin = 0;
            gho++;

            
            while (i < nim && word.charAt(i) == res && cin < 9) {
                cin++;
                i++;
                gho =0;
            }

           
            anan.append(cin).append(res);
        }
        gho = 1;

        return anan.toString();
        
    }
}
