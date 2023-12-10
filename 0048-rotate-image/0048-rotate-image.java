class Solution {
    public void reverse(int[][] matrix){
        int n = matrix.length;
        // int k = n ;
        for(int i = 0 ; i < n ; i++){
             for(int j = 0; j < n / 2; j++) {
                int k = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = k;
            }
        }
    }
    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        reverse(matrix);
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
    }
}