import java.util.HashMap;

class Solution {
    public int maximumLengthSubstring(String s) {

        HashMap<Character, Integer> anan = new HashMap<>();
        
        int stu = 0, edu = 0;
        int him = 0;

        for (edu = 0; edu < s.length(); edu++) {

            char recent = s.charAt(edu);

            if (anan.containsKey(recent)) {

                anan.put(recent, anan.get(recent) + 1);

                while (anan.get(recent) > 2) {

                    char stuChar = s.charAt(stu);

                    anan.put(stuChar, anan.get(stuChar) - 1);

                    if (anan.get(stuChar) == 0) {

                        anan.remove(stuChar);
                    }
                    stu++;
                }
            } 
            else {
                anan.put(recent, 1);
            }

            him = Math.max(him, edu - stu + 1);
        }
        return him;
    }

}
