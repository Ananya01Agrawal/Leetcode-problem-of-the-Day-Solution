import java.util.List;

public class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        int neem = nums.size();// calculating the lemght of the array
        if (neem < 3) {/// check if lenght of the array is elsss than 3 
            return true;// return true
        }

        for (int i = 0; i < neem - 1; i++) {
            if (nums.get(i) + nums.get(i + 1) >= m) {
                return true;
            }
        }

        return false;
    }
}
