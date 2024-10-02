class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length; 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        
        int[] nums = new int[len]; 
        
        // copy into new array nums 
        for(int i=0; i<len; i++) {
            nums[i] = arr[i]; 
        }

        // sorting the new copy array 
        Arrays.sort(nums); 

        // now putting this data into hashmap 
        int rank=1; 
        for(int i=0; i<len; i++) {
            if(! map.containsKey(nums[i])) { // if map does not contain key, then add it and increae the rank. 
                map.put(nums[i], rank++); 
            }
        } 

        for(int i=0; i<len; i++) {
            arr[i]=map.get(arr[i]); 
        }

        return arr; 
    }
}
