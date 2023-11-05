class Solution {
    public int getWinner(int[] arr, int k) {
        int count=0;
        int current=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>current){
                current=arr[i];
                count=1;
            }else{
                count++;
            }
            if(count>=k) return current;
        }
        return current;
    }
}
