class Solution {
    public long maxKelements(int[] nums, int k) {   
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        long sum = 0;
        while(k>0){
            int val = pq.poll();
            sum += val;
            pq.add((int)Math.ceil(val/3.0));
            k--;
        }
        return sum;
    }
}
