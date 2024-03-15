class Solution {
    public int[] productExceptSelf(int[] nums) {       
        int len = nums.length;
        int[] result = new int[len];

        int leftProduct = 1;
        for (int i = 0; i < len; i++) {
            result[i] = leftProduct; // Store product of elements to the left
            leftProduct *= nums[i]; // Calculate product of elements to the left
        }

        int rightProduct = 1;
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= rightProduct; // Multiply by product of elements to the right
            rightProduct *= nums[i]; // Calculate product of elements to the right
        }

        return result;
    }
}
