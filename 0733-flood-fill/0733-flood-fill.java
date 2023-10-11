class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        /**
            starting point image[i][j]
            sr means starting row
            sc means starting column
            color means changing a cell to this color         
         */
         
         // if starting column is already colored 'color'
         if(image[sr][sc] == color) return image;
         // start dfs
         dfs(image, sr, sc, color, image[sr][sc]);
         return image;
    }

    private void dfs(int[][] image, int sr, int sc, int color, int current) {

        // deal index bounds
        // System.out.println(image.length); 
        // System.out.println(image[0].length);
        // to check if the current pixel is already different color 
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || current != image[sr][sc]) return; // 외우기 


        // mark the image cell as a color
        image[sr][sc] = color; // check if it is visited
        // make 4-directionally recursive calls 
        dfs(image, sr-1, sc, color, current); // left
        dfs(image, sr+1, sc, color, current); // right
        dfs(image, sr, sc-1, color, current); // top
        dfs(image, sr, sc+1, color, current); // bottom

    }
}