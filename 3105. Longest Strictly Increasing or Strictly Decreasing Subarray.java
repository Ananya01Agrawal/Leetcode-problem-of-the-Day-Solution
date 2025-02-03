class Solution {
    public int longestMonotonicSubarray(int[] anan) {
        if (anan == null || anan.length == 0) {
            return 0;
        }

        int high = 1;
        int recent = 1;
        Boolean fasting = null;

        for (int i = 1; i < anan.length; i++) {
            if (anan[i] > anan[i - 1]) {
                if (fasting == null || fasting) {
                    recent++;
                    fasting = true;
                } else {
                    recent = 2;
                    fasting = true;
                }
            } else if (anan[i] < anan[i - 1]) {
                if (fasting == null || !fasting) {
                    recent++;
                    fasting = false;
                } else {
                    recent = 2;
                    fasting = false;
                }
            } else {
                recent = 1;
                fasting = null;
            }

            high = Math.max(high, recent);
        }

        return high;
    }
}
