class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
          // Get the length of the input arrays
        int nim = bottomLeft.length;
        // Initialize a variable to store the maximum square area
        long maxi = 0;

        for (int i = 0; i < nim; i++) {
            
            for (int j = i + 1; j < nim; j++) {
                 // Determine the coordinates of the overlapping region
                int xim1 = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                
                int yim1 = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                
                int xim2 = Math.min(topRight[i][0], topRight[j][0]);
                
                int yim2 = Math.min(topRight[i][1], topRight[j][1]);

                // If there is an overlapping region
                if (xim1 < xim2 && yim1 < yim2) {
                    int anan = Math.min(xim2 - xim1, yim2 - yim1);
                    // Update the maximum square area if needed
                    maxi = Math.max(maxi, (long) anan * anan);
                }
            }
        }
         // Return the maximum square area

        return maxi;
    }
}
