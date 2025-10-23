class Solution {
  public boolean hasSameDigits(String s) {
    int n = s.length();
    int[] digits = new int[n];

    // Convert string to integer array
    for (int i = 0; i < n; i++) {
      digits[i] = s.charAt(i) - '0';
    }

    // Perform operations until only 2 digits remain
    for (int len = n; len > 2; len--) {
      for (int j = 0; j < len - 1; j++) {
        digits[j] = (digits[j] + digits[j + 1]) % 10;
      }
    }

    // Check if final two digits are equal
    return digits[0] == digits[1];
  }
}
