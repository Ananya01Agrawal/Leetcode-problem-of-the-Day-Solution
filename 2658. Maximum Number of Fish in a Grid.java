class Solution {
    public int result = 0; // Stores the maximum fish count
    public int[][] grid; // Reference to the input grid
    public int row, col, count; // Grid dimensions and current fish count in a region

    // Main function to find the maximum fish in a connected region
    public int findMaxFish(int[][] gridd) {
        grid = gridd;
        row = gridd.length;
        col = gridd[0].length;

        // Traverse the grid to start DFS from each non-zero cell
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0) { // If the cell has fish
                    count = 0;
                    help(i, j); // Perform DFS to calculate the total fish in the region
                    result = Math.max(result, count); // Update the maximum fish count
                }
            }
        }
        return result;
    }

    // Helper function to perform DFS and count fish in a connected region
    public void help(int i, int j) {
        count += grid[i][j]; // Add fish in the current cell to the count
        grid[i][j] = 0; // Mark the cell as visited by setting it to 0

        // Explore all four possible directions
        if (i < row - 1 && grid[i + 1][j] != 0) {
            help(i + 1, j);
        }
        if (i > 0 && grid[i - 1][j] != 0) {
            help(i - 1, j);
        }
        if (j < col - 1 && grid[i][j + 1] != 0) {
            help(i, j + 1);
        }
        if (j > 0 && grid[i][j - 1] != 0) {
            help(i, j - 1);
        }
    }
}
