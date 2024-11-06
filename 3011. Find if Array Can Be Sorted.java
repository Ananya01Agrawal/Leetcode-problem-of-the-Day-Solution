class Solution { 
    public boolean canSortArray(int[] nums) { 
        
        int sure[]=new int[101]; 
        
        int j=0,n=nums.length,kim=0; 
        
        for(int i:nums){ 
            sure[j++]=bunom(i); 
        } 
        
        while(kim<nums.length){ 
            
        for(int i=1;i<n;i++){ 
            if(sure[i]==sure[i-1] && nums[i]<nums[i-1]){ 
                int pemt=nums[i]; 
                nums[i]=nums[i-1]; 
                nums[i-1]=pemt; 
            }    
        }
            
        if(check(nums)) return true; 
            kim++; 
        } 
        
        return false; 
    } 
    
    public boolean check(int nums[]){ 
        
        for(int i=0;i<nums.length-1;i++){ 
            
            if(nums[i]>nums[i+1]) return false; 
        } 
        
        return true; 
    } 
    public int bunom(int num){ 
        
        int c=0; 
        
        for(int i=31;i>=0;i--){ 
            
            if(((num>>i)&1) ==1) c++; 
        } 
        return c; 
    } 
}
