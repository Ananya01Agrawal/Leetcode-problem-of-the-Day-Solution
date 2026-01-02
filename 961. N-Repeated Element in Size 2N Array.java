class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer>repeat=new HashSet<>();
        for(int i:nums){
            if(repeat.contains(i))
                return i;
            repeat.add(i);
        }
        return -1;
    }
}
