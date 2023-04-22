class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        int prev = 0;
        for (int i = 1; i <= n; i++) {
            prev = 0;
            for (int j = 1; j <= n; j++) {
                int temp = dp[j];
                if (s.charAt(i - 1) == s.charAt(n - j)) {
                    dp[j] = prev + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev = temp;
            }
        }
        return n - dp[n];
    
        
    }
}
