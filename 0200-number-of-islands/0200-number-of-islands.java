class Solution {
    public boolean valid(int m,int n,int i, int j){
        if(i < 0 || i >= m || j < 0 || j >= n) return false;
        return true;
    }
    public void dfs(char[][] grid,int i,int j,boolean [][] vis){
        int m = grid.length;
        int n = grid[0].length;
        int x[] = {-1,1,0,0};
        int y[] = {0,0,-1,1};
        vis[i][j] = true;
        for(int k = 0; k < 4; k++){
            int row = i + x[k];
            int col = j + y[k];
            if(valid(m,n,row,col) && grid[row][col] == '1' && vis[row][col] == false){
                dfs(grid,row,col,vis);


            }
        }
    }
    public int numIslands(char[][] grid) {
        //M x N ka 2d matrix
        if(grid == null || grid.length == 0) return 0;

        int m = grid.length; 
        int n = grid[0].length;
        int count = 0;


        boolean[][] vis = new boolean[m][n]; //all false rhega 
        //only ground pr hona chaiye  pani nhi i.e. only 1 not 0 or out of matrix
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    count++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return count;


        
    }
}