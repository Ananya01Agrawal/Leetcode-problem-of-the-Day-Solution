public class Solution {
    // Method to find the champion in a grid
    public int findChampion(int[][] grid) {
        int numberOfPlayers = grid.length;

        // Loop through each player
        for (int currentPlayer = 0; currentPlayer < numberOfPlayers; currentPlayer++) {
            int opponent = 0;

            // Check each opponent for the current player
            for (; opponent < numberOfPlayers; opponent++) {
                if (currentPlayer == opponent) {
                    // Skip if it's the same player
                    continue;
                }

                // If the opponent defeats the current player, break the loop
                if (grid[opponent][currentPlayer] == 1) {
                    break;
                }
            }

            // If the current player was not defeated by any opponent, they are the champion
            if (opponent == numberOfPlayers) {
                return currentPlayer;
            }
        }

        // No champion found
        return -1;
    }
}
