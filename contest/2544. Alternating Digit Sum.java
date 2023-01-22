class Solution {
    public int alternateDigitSum(int n) {
        String nString = Integer.toString(n);
        int total = 0;
        for (int i = 0; i < nString.length(); i++) {
            if (i % 2 == 0) {
                total += Character.getNumericValue(nString.charAt(i));
            } else {
                total -= Character.getNumericValue(nString.charAt(i));
            }
        }
        return total;
    }
}
