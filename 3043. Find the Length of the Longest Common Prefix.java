class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        Map<String, Integer> anan = new HashMap<>();

        for (int nim : arr1) {
            
            String aim = String.valueOf(nim);
            
            for (int i = 1; i <= aim.length(); ++i) {
                
                anan.put(aim.substring(0, i), anan.getOrDefault(aim.substring(0, i), 0) + 1);
            }
        }

        
        int cal = 0;
        
        for (int nim : arr2) {
            
            String aim = String.valueOf(nim);
            
            for (int i = 1; i <= aim.length(); ++i) {
                
                if (anan.containsKey(aim.substring(0, i))) {
                    
                    cal = Math.max(cal, i);
                } 
                else {
                    break;
                }
            }
        }

        return cal;
    }
}
