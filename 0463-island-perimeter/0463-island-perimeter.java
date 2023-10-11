public class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }

        return 0;
    }

    private int dfs(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return 1;
        }

        if (grid[row][col] == 0) {
            return 1;
        }

        if (grid[row][col] == -1) {
            return 0;
        }

        // Mark the cell as visited
        grid[row][col] = -1;

        int perimeter = 0;
        perimeter += dfs(grid, row - 1, col);
        perimeter += dfs(grid, row + 1, col);
        perimeter += dfs(grid, row, col - 1);
        perimeter += dfs(grid, row, col + 1);

        return perimeter;
    }
}
