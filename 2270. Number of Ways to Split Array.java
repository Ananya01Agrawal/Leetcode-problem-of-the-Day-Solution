class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int m=n+1;
        long[] arr=new long[m];
        int cnt=0;

        //Doing the Prefix sum
        arr[0]=0;
        for(int i=1; i<m; i++){
            arr[i]=arr[i-1]+nums[i-1];
        }

        //Checking a valid split 
        for(int i=1; i<m-1; i++){
            if(arr[i] >= arr[m-1]-arr[i]){
                cnt++;
            }
        }

        return cnt;
    }
}
