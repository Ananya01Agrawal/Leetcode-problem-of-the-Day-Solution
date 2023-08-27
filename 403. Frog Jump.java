class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        boolean[][] dp = new boolean[n][n + 1];
        dp[0][1] = true;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int jump = stones[i] - stones[j];
                
                if (jump <= j + 1) {
                    dp[i][jump] = dp[j][jump - 1] || dp[j][jump] || dp[j][jump + 1];
                    if (i == n - 1 && dp[i][jump]) return true;
                }
            }
        }
        return false;
    }
}

/*
In this code we have use a 2D dynamic programming array dp where dp[i][j] indicates if the frog can reach stone i with a jump of length j.
Initialize dp[0][1] as true because the frog starts at the first stone and can jump one unit.
Iterate through each stone from the second one (i starting from 1):
For each stone, iterate through all previous stones (j from 0 to i - 1).
Calculate the jump distance jump between the current stone and the previous stone.
If jump is within the valid range of jump distances (from 1 to j + 1).
Update dp[i][jump] based on previous states: dp[j][jump - 1], dp[j][jump], and dp[j][jump + 1].
If the current stone is the last stone and the frog can reach it with a valid jump distance, return true.
If no valid jump sequence is found for the last stone, return false.
*/


