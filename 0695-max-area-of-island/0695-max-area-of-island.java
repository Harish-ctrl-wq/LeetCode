class Solution {
    public static int dfs(int grid[][], int i, int j, boolean[][] vis){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || vis[i][j] || grid[i][j] != 1)
            return 0;
        vis[i][j] = true;
        int area = 1;
       
           
        area += dfs(grid, i + 1, j, vis);
        area += dfs(grid, i - 1, j, vis);
        area += dfs(grid, i, j + 1, vis);
        area += dfs(grid, i, j - 1, vis);
        return area;
        

    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxarea = 0;
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                  int area = dfs(grid, i, j, vis);
                  maxarea = Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
       

    }

}