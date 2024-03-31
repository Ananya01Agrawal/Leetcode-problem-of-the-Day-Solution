public class Solution {
    public int maxBottlesDrunk(int xin, int y) {

        int anan = xin;

        int value = xin;
        
        while (value >= y) {

            value -= y;

            value++;

            anan++;

            y++;
            //System.out.println(anan + " " + value);
        }
        
        return anan;
    }
}
