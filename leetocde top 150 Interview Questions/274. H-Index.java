class Solution {
    public int hIndex(int[] citations) {
        // In this we use the concept of the Bucket Sort
        int n=citations.length;
        // create an array of length +1
        int[] buckets=new int[n+1];
        for(int c:citations){
            if(c>=n){
                buckets[n]++;
            }
            else{
                buckets[c]++;
            }
        }
        int count=0;
        // backward traversing
        for(int i=n;i>=0;i--){
            count+=buckets[i];
            if(count>=i){
                return i;
            }
        }
        return 0;

        
    }
}
