class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m*n; i++){
            int row = i / n;
            int col = i % n;
            //main diagonal ke liye top left se bottom right k liye
            if(row == col && grid[row][col] == 0){
                return false;
                
            }
            // anti diagonal top right se bottom left k liye
            if(col == n - 1 - row){
                if(grid[row][col] == 0) return false;
            }
            // jo diagonal nhi he unke liye
            if(row != col && col != n - 1 - row){
             if(grid[row][col] != 0)
             return false;
            }
            

        }
            return true;

        
    }
}