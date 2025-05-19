class Solution {
    public boolean checker(int aim, int bim, int cim) {
        
        return (aim + bim > cim) && (bim + cim > aim) && (cim + aim > bim);
        
    }

    public String triangleType(int[] nums) {
        
        int aim = nums[0];
        
        int bim = nums[1];
        
        int cim = nums[2];

        if (checker(aim, bim, cim)) {
            
            if (aim == bim && bim == cim) {
                
                return "equilateral";
            } 
            else if (aim != bim && bim != cim && cim != aim) {
                
                return "scalene";
            } 
            else {
                
                return "isosceles";
            }
        } 
        else {
            
            return "none";
        }
    }
}
