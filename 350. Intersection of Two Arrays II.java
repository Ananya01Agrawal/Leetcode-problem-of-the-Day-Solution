import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums1) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (hm.containsKey(n) && hm.get(n) >= 1) {
                result.add(n);
                hm.put(n, hm.get(n) - 1);
            }
        }

        int res[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
