import java.util.*;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        //sort the array
        Arrays.sort(happiness);
        
        int nim = happiness.length;
        
        long anan = 0;
        
        int resi = 0;
        
        for (int i = nim - 1; i >= 0; i--) {
            
            anan += Math.max(0, happiness[i] - resi);
            
            resi++;
            
            if (resi >= k)
                break;
        }
        
        return anan;
    }
}
