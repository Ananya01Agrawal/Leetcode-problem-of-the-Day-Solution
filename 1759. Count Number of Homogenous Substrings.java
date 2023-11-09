public class Solution {
    public int countHomogenous(String s) {
        final int MOD = 1000000007;
        int ans = s.length();
        int cnt = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ans = (int) ((ans + cnt) % MOD);
                cnt++;
            } else {
                cnt = 1;
            }
        }
        return ans;
    }
}
