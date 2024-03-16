class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count--;
            } 
            else {
                count++;
            }
            if (countMap.containsKey(count)) {
                maxLength = Math.max(maxLength, i - countMap.get(count));
            } 
            else {
                countMap.put(count, i);
            }
        }
        return maxLength;
    }
}
