class Solution {
    public String clearDigits(String s) {
        StringBuilder stc = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                stc.deleteCharAt(stc.length() - 1);
            }else{
                stc.append(s.charAt(i));
            }
        }

        return stc.toString();
    }
}
