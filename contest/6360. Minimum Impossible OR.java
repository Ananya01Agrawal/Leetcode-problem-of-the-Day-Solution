
class Solution {
    public int minImpossibleOR(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        int x = 1;
        while (true) {
            if (!mp.containsKey(x)) {
                return x;
            }
            x = x * 2;
        }
    }
}
