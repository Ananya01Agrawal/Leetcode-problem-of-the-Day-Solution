class Solution {
    // Function to check if two matrices are similar after cyclic shifts
    public boolean areSimilar(int[][] matrix, int k) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Create a copy of the initial matrix for comparison
        int[][] start_Matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(matrix[i], 0, start_Matrix[i], 0, columns);
        }

        // Apply cyclic shifts to alternate rows based on 'k'
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 1) {
                matrix[i] = Cyc_Sft_Mat(matrix[i], k); // Apply cyclic shift to the row
            } else {
                matrix[i] = Cyc_Sft_Mat(matrix[i], -k); // Apply inverse cyclic shift to the row
            }
        }

        // Check if the matrices are similar after the cyclic shifts
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (start_Matrix[i][j] != matrix[i][j]) {
                    return false; // Matrices are different after the shifts
                }
            }
        }

        return true; // Matrices are similar after the shifts
    }

    // Function to perform cyclic shift on a row
    private static int[] Cyc_Sft_Mat(int[] row, int k) {
        int length = row.length;
        k %= length;

        int[] anan = new int[length];
        for (int i = 0; i < length; i++) {
            anan[(i + k + length) % length] = row[i]; // Perform cyclic shift
        }

        return anan;
    }
}
