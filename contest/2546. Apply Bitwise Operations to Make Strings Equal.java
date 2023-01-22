class Solution {
    public boolean makeStringsEqual(String s, String target) {
        if (s.equals(target)) {
            return true;
        }
        int n = s.length();
        if (s.equals("0".repeat(n)) || target.equals("0".repeat(n))) {
            return false;
        }
        return true;
    }
}
