class Solution {
    public int minOperations(int kim) {
        
        if (kim == 1) {
            
                return 0;
            }
            
            int reply = Integer.MAX_VALUE;
        
            for (int i = 1; i <= (kim / 2); i++) {
                
                int ord = (int) Math.ceil((double) kim / i);
                
                int less = (i - 1) + (ord - 1);
                
                reply = Math.min(less, reply);
            }
            
            return reply;
    }
}
