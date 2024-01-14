import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> anan = new HashMap<>();

        // calc the frequency of each element
        for (int num : nums) {
            anan.put(num, anan.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int highCuo = 0;
        for (int calc : anan.values()) {
            highCuo = Math.max(highCuo, calc);
        }

        // calc the number of elements with the maximum frequency
        int highCo = 0;
        for (int calc : anan.values()) {
            if (calc == highCuo) {
                highCo += calc;
            }
        }

        return highCo;
    }
}
