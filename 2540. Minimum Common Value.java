class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> treeset1 = new TreeSet<>();
        Set<Integer> treeset2 = new TreeSet<>();
        //Put the numbers in the sets
        for(int num : nums1){
            treeset1.add(num);
        }
        
        for(int num : nums2){
            treeset2.add(num);
        }
        //iterate any set and if we find the same number in the other set, we return that
		//Here since it is a treeset, we are starting from the smallest number itself.
        for(Integer num : treeset1){
            if(treeset2.contains(num)){
                return num;
            }
        }
        
        return -1;
    }
}
