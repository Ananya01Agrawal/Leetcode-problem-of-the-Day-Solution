class Solution {
    public int integerBreak(int n) {//unbounded knapsack variation
        int[] dp = new int[n+1];

        Arrays.fill(dp, 1);//can't multply with 0

        //must not use n itself as n + 0 = n so no breaking up into k >= 2 segments
        for (int i = 1; i <= n-1; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i <= j) {
                    dp[j] = Math.max(dp[j], dp[j-i] * i);
                }
                //else stays same
            }
        }

        return dp[n];
    }
}
