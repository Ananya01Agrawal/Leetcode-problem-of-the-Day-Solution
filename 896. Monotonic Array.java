class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean increasing=false, decreasing=false;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]> arr[i-1]){
                increasing=true;
            }
            else if(arr[i]<arr[i-1]){
                decreasing= true;
            }
        }
        boolean result=(increasing && decreasing)? false:true;
        return result;
    }
}
