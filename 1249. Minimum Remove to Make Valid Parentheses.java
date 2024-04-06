class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int pointer = 0;
        int validCloses = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (validCloses > 0) {
                    sb.append(')');
                    validCloses--;
                }
            } else if (c == '(') {
                pointer = Math.max(i + 1, pointer);
                while (pointer < s.length()) {
                    if (s.charAt(pointer++) == ')') {
                        sb.append('(');
                        validCloses++;
                        break;
                    }
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
