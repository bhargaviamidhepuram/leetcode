class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] mat = new int[c][r];
        for(int i = 0; i < r; i++){
            //int k = 0;
            for(int j = 0; j < c; j++){
                mat[j][i] = matrix[i][j];
                //k++;
            }
        }
        System.out.println(mat);
        return mat;
    }
}