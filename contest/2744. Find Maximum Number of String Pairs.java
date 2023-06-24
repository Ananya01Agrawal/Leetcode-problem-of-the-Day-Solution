class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        Map<String, Integer> anan = new HashMap<>();// we have first created a hashmap
        int cn = 0;// initial our count value is zero
        
        for(String word : words){
            
            String mk = new StringBuilder(word).reverse().toString();
            
            if(anan.containsKey(mk)){// check if reverse element present in the hashmap
                
                cn++;// increase the count
                
                anan.put(mk, anan.get(mk) - 1);
                
                if(anan.get(mk) == 0){
                    
                    anan.remove(mk);
                }
            }
            else{
                
                anan.put(word, anan.getOrDefault(word, 0) + 1);
            }
        }
        
        return cn;
        
    }
}
