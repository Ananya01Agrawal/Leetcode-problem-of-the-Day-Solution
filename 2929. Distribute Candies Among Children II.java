class Solution {
    public long distributeCandies(int n, int limit) {
        if (n > 3 * limit) {
            return 0;
        }
        
        long ansi = comb2(n + 2);
        
        if (n > limit) {
            
            ansi -= 3 * comb2(n - limit + 1);
        }
        
        if (n - 2 >= 2 * limit) {
            
            ansi += 3 * comb2(n - 2 * limit);
        }
        
        return ansi;
        
    }

    private long comb2(int n) {
        
        return 1L * n * (n - 1) / 2;
        
    }
}
