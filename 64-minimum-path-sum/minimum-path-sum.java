class Solution {
    public int minPathSum(int[][] grid) {
        int top=grid.length;
        int bottom=grid[0].length;
        for(int i=1;i<top;i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int j=1;j<bottom;j++){
            grid[0][j] += grid[0][j-1];
        }
        for(int i=1;i<top;i++){
            for(int j=1;j<bottom;j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[top-1][bottom-1];
    }
}