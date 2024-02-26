class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        //create a hashmap
        HashMap<Integer,Integer> him=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            him.put(nums[i],him.getOrDefault(nums[i],0)+1);
        }
          // Iterate through the keys of the hashmap
        
        for(int i:him.keySet())
        {
             // If any number appears more than twice, return false
            if(him.get(i)>2)
            {
                return false;
            }
        }
        // If no number appears more than twice, return true
        return true;
    }
}
