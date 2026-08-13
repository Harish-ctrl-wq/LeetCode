class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
            //main diagonal ke liye top left se bottom right k liye
            if(i == j && grid[i][j] == 0){
                return false;
                
            }
            // anti diagonal top right se bottom left k liye
            if(j == n - 1 - i){
                if(grid[i][j] == 0) return false;
            }
            // jo diagonal nhi he unke liye
            if(i != j && j != n - 1 - i){
             if(grid[i][j] != 0)
              return false;
            }
        }

        }
            return true;

        
    }
}