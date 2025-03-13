class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] counts = new int[n + 1];
        int k = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            while (sum + counts[i] < num) {
                if (k == queries.length) return -1;
                int left = queries[k][0], right = queries[k][1], value = queries[k][2];
                k++;

                if (right < i) continue;
                counts[Math.max(left, i)] += value;
                counts[right + 1] -= value;
            }
            sum += counts[i];
        }
        return k;
    }
}
