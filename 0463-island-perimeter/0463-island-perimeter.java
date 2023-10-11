public class Solution {
    public int islandPerimeter(int[][] grid) {
        /**
            grid[i][j] = 1 : land
            grid[i][j] = 0 : water

            if grid surrounded by water, + 4
            if grid surrounded by land, + 0

            we can access the top/bottom/left/right
            and determine if the side is 0 or not,
            if 0, + 1 otherwise 0

         */

        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // assume that all sides of the current cell are water
                    perimeter += 4; 

                    // check if left cell is land
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2; 
                    }
                    
                    // check if bottom cell is land
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2; // bottom
                    }
                }
            }
        }

        return perimeter;
    }
}
