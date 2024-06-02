class Solution {
    public int minimumChairs(String sim) {
       {
        int anan = 0;
        int maxi = 0;

        for (char issui : sim.toCharArray()) {
            if (issui == 'E') {
                anan++;
                if (anan > maxi) {
                    maxi = anan;
                }
            } else if (issui == 'L') {
                anan--;
            }
        }

        return maxi;
       }
    }
}
