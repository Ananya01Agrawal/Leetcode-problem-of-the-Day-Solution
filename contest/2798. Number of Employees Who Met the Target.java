class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int anan=hours.length;
        int tar=0;
        for(int i=0;i<anan;i++){
            if(hours[i]>=target){
                tar++;
            }
        }
        return tar;
    }
}
