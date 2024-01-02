class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        // Create an array to store frequency of each number, initializing with size of nums + 1
        int[] frequency = new int[nums.length + 1];

        // ArrayList to store lists of integers forming the matrix
        ArrayList<List<Integer>> result = new ArrayList<>();

        // Loop through each number in the input array 'nums'
        for (int num : nums) {

            // Check if the frequency of the current number is greater than or equal to the size of 'result'
            if (frequency[num] >= result.size()) {
                // If yes, create a new row in the result matrix
                result.add(new ArrayList<>());
            }

            // Add the current number to the appropriate row based on its frequency
            result.get(frequency[num]++).add(num);
        }

        // Return the resulting matrix
        return result;
    }
}
