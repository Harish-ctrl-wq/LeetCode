class Solution {
    public void setZeroes(int[][] matrix) {
    int m = matrix.length; //rows
    int n = matrix[0].length; // cols
    int ele = m*n;
    boolean[] rowzero = new boolean[m];
    boolean[] colzero = new boolean[n];

    for(int i = 0; i < ele ; i++){
        int row = i/n;
        int col = i%n;
        if(matrix[row][col] == 0){
            rowzero[row] = true;
            colzero[col] = true;
        }
    }

    for(int j = 0; j < ele; j++){
        int r = j/n;
        int c = j%n;
        if(rowzero[r] || colzero[c]){
            matrix[r][c] = 0;
        }
    }
    

        
    }
}