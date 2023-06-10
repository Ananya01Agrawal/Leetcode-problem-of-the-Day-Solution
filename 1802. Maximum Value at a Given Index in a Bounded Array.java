class Solution {
    public int maxValue(int n, int index, int maxSum) {
        // the value must >= 1 so -n could make smallest element in array be 0
        maxSum -= n;
        int left = 0;
        int right = maxSum;
        int res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = getSum(n, index, mid);
            // if curr_sum <= maxSum means it might be the answer but we still need to check the larger one. So we update res and check next left;
            if (sum <= maxSum) {
                res = Math.max(mid, res);
                left = mid + 1;
            } else {
            // curr_sum > maxSum means this number could not be answer, then -1;
                right = mid - 1;
            }
        }
        return res + 1;
    }
    private long getSum(int n, int index, int val) {
        /*  val is the curr peak value at index (index). 
            In first step. -n made the element could be 0
            So the smallest num at left most or right most could be 0
        */
        long sum = 0;
        // Get the left_most element and we could calculate left sum.
        int left_max = Math.max(val - index, 0);
        sum += (long)(val + left_max) * (val - left_max + 1) / 2;
        // Get the right_most element
        int right_max = Math.max(val - ((n - 1) - index), 0);
        sum += (long)(val + right_max) * (val - right_max + 1) / 2;
        // return sum - val because of when we calculate left sum and right sum, we both add val in them.
        return sum - val;
    }
}
