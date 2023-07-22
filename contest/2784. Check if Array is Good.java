class Solution {
    public boolean isGood(int[] ana) {
        Arrays.sort(ana);
        int n = ana.length;
        if (ana[n - 1] != n - 1 || ana[n - 2] != n - 1)
            return false;
        for (int i = 0; i < n - 1; i++) {
            if (ana[i] != i + 1)
                return false;
        }
        return true;
    }
}
