class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int time) {
        // Calculate the absolute difference in x and y coordinates
        long xin = Math.abs(sx - fx);
        long yin = Math.abs(sy - fy);

        // Find the maximum of x and y
        long gin = Math.max(xin, yin);

        // Check if the maximum difference is greater than t
        // or if the maximum difference is zero and t is in the range (0, 2)
        
        
       

// The maximum difference (g) is greater than the maximum allowed time (t), indicating that it's not reachable in time.
// The maximum difference is zero (g == 0) and t is in the range (0, 2), indicating that it's also not reachable within the given constraints.
        
        if (gin > time || (gin == 0 && time > 0 && time < 2)) {
            return false;
        }
        else {
            return true;
        }
    }
}
