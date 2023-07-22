/**
 * Solution written by ananya
 */
class Solution {
    /**
     * Function to calculate the maximum score considering the given array and value x.
     *
     * @param nums An array of integers representing the scores.
     * @param x The value x used for calculating the maximum score.
     * @return The maximum score after considering the array and x.
     */
    public long maxScore(int[] nums, int xan) {
        // Initialize an array to hold the maximum scores for even and odd elements
        long[] Scores = new long[]{0, 0};
        // Variable to store the maximum score
        long maxi = 0;

        // Loop through the array in reverse order
        for (int i = nums.length - 1; i >= 0; i--) {
            // Calculate the parity of the current element
            int parity = nums[i] % 2;
            // Calculate the maximum score considering taking the current element
            maxi = Math.max(0, Math.max(Scores[parity], Scores[1 - parity] - xan) + nums[i]);
            // Update the maximum scores array for the corresponding parity
            Scores[parity] = Math.max(Scores[parity], maxi);
        }

        // Return the final maximum score
        return maxi;
    }
}
