class Solution {
    public int minOperations(int[] nums, int k) {
        
        PriorityQueue<Long> png = new PriorityQueue<Long>();
        
        for(int nim : nums){
            
            png.add((long)nim);
        }
        int cim = 0;
        
        while(png.peek() < k){
            
            long xim = png.poll();
            
            long yim = png.poll();
            
            long val = Math.min(xim, yim) * 2 + Math.max(xim , yim);
            
            png.add(val);
            
            cim++;
            
            if(png.peek() > k) return cim;
        }
        return cim;
    }
}
