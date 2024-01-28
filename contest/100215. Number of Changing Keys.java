public class Solution {
    public int countKeyChanges(String s) {
        // create an array
        char[] anan = s.toCharArray();

        for (int i = 0; i < anan.length; i++) {
            // convert the string to lower case
            anan[i] = Character.toLowerCase(anan[i]);
        }

        int add = 0;
        for (int i = 0; i < anan.length - 1; i++) {
            if (anan[i] != anan[i + 1]) {
                add++;
            }
        }

        return add;
    }
}
