class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(Integer i : nums1){
           set1.add(i);
        }
        for(Integer i : nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int k=0;
        int[] res = new int[set2.size()];
        for(Integer i : set2){
            res[k++]=i;
        }
        return res;
    }
}
