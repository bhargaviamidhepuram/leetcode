class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col < r*c || row*col > r*c){
            return mat;
        }
        int[][] m = new int[r][c];
        int n1 = 0;
        int n = 0;
        for(int i = 0; i < row; i++){
           for(int j = 0; j < col; j++){
             m[n1][n] = mat[i][j];
                if(n + 1 < c){
                    n++;
                    continue;
                }
                if(n1 + 1 < r){
                    n1++;
                    n = 0;
                }
           }
        }
        return m;
    }
}