class Solution {
    int count=0;
    public void targetSum(int[] arr, int idx, int total, int target) {
        if(idx == arr.length){
            if(total == target) count++;
            return;
        }
        else{
            targetSum(arr, idx+1, total+arr[idx], target);
            targetSum(arr, idx+1, total-arr[idx], target);
        }
    }
    public int findTargetSumWays(int[] nums, int target) {
        targetSum(nums, 0, 0, target);
        return count;
    }
}
