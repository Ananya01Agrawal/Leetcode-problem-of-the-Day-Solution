class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length(), count = 0;
        char a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    a = s1.charAt(i);
                    b = s2.charAt(i);
                } else if (count == 2) {
                    c = s1.charAt(i);
                    d = s2.charAt(i);
                } else return false;
            }
        }
        return count == 0 || (count == 2 && a == d && b == c);
    }
}
