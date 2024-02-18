class Solution {
    public int maxOperations(int[] nums) {
        int nim=nums.length;
        // checking the base case
        if(nim<2) return 0;
        
        int anan=1;
        
        int reply=nums[0]+nums[1];
        //create a queue
        Queue<Integer>mnu=new LinkedList<>();
        
        for(int i=2;i<nim;i++){
            mnu.offer(nums[i]);
        }
        
        while(mnu.size()>1){
            
            int aim=mnu.poll();
            
            int bim=mnu.poll();
            
            if(aim+bim==reply){
                anan++;
            }
            else{
                return anan;
            }
        }
        return anan;
    }
}
