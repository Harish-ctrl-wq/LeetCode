class Solution {
    public boolean valid(int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n)return false;
        return true;
    }
    public void dfs(int i, int j, int m,int n,char [][] board){
        board[i][j] = '#';
        int x[] = {1,-1,0,0};
        int y[] = {0,0,1,-1};
        for(int k = 0; k < 4; k++){
            int row = i + x[k];
            int col = j + y[k];
            if(valid(row,col,m,n) && board[row][col] == 'O'){
                dfs(row,col,m,n,board);
            }
        }
        return;

    }
    public void solve(char[][] board){
        int m = board.length;
        int n = board[0].length;
        //phli wli row
        for(int i = 0; i < n; i++){
            if(board[0][i] == 'O'){
                dfs(0,i,m,n,board);
            }
        }
        // 2 row
        for(int i = 0; i < n; i++){
            if(board[m-1][i] == 'O'){
                dfs(m-1,i,m,n,board);
            }
        }
        // 1st col
        for(int j = 0; j < m; j++){
            if(board[j][0] == 'O'){
                dfs(j,0,m,n,board);
            }
        }
        //2nd col
        for(int j = 0; j < m; j++){
            if(board[j][n-1] == 'O'){
                dfs(j,n-1,m,n,board);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        return;


        
    }
}