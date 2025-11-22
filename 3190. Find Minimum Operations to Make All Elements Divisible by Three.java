class Solution {
    public int minimumOperations(int[] nums) {
       
        int cim = 0;
        
        int cim2= 0;

        for (int anan : nums) {
            
            int rim = anan % 3;
            
            if (rim == 1) {
                cim++;
            } 
            
            else if (rim == 2) {
                cim2++;
            }
        }

        return cim + cim2;
    }
}
