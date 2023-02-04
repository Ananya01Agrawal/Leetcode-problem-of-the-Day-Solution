class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> banSet = new HashSet<>();
        for (int num : banned) {
            banSet.add(num);
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (banSet.contains(i)) continue;
            if (i <= maxSum) {
                count++;
                maxSum -= i;
            } else {
                break;
            }
        }
        return count;
    }
}
