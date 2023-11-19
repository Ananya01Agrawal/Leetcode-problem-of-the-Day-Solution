class Solution {
    long minimumSteps(String s) {
        long cnzero = 0;
        for (char i : s.toCharArray()) {
            if (i == '0') {
                cnzero++;
            }
        }

        long i = 0;
        long cur = 0, sun = 0;
        while (i < s.length()) {
            if (s.charAt((int) i) == '0') {
                sun = sun + i - cur;
                cur++;
            }
            i++;
        }
        return sun;
    }
}
