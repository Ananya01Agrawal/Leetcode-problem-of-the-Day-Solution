import java.util.*;
 class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int first_len = nums1.length;
        int second_len = nums2.length;

        Set<Integer> him = new HashSet<>();
        Set<Integer> hen = new HashSet<>();
        
        for (int num : nums1) {
            him.add(num);
        }
        
        for (int num : nums2) {
            hen.add(num);
        }

        int cn1 = 0;
        int cn2 = 0;

        for (int i = 0; i < first_len; ++i) {
            int vali = nums1[i];
            if (hen.contains(vali)) {
                cn1++;
            }
        }

        for (int i = 0; i < second_len; ++i) {
            int vali = nums2[i];
            if (him.contains(vali)) {
                cn2++;
            }
        }

        int[] arr2 = { cn1, cn2 };

        return arr2;
    }
}
