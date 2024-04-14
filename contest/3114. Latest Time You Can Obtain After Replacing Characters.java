class Solution {
    public String findLatestTime(String sim) {
        char[] anan = sim.toCharArray();

        if (anan[0] == '?') {
            if (anan[1] == '?' || (anan[1] >= '0' && anan[1] <= '9')) {
                anan[0] = (anan[1] <= '1' || anan[1] == '?') ? '1' : '0';
            }
        }

        if (anan[1] == '?') {
            anan[1] = (anan[0] == '1') ? '1' : '9';
        }

        if (anan[3] == '?') {
            anan[3] = '5';
        }

        if (anan[4] == '?') {
            anan[4] = '9';
        }

        return new String(anan);
    }
}
