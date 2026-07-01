class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // transform
        // boolean[][] swap = new boolean[n][n];
        for(int row = 0; row<n;row++){
            for(int col = row+1; col < n; col++){
                // if(!swap[row][col]){
                //     int temp = matrix[row][col];
                //     matrix[row][col] = matrix[col][row];
                //     matrix[col][row] = temp;
                //     swap[row][col] = true;
                //     swap[col][row] = true;
                // }

                int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                
            }
        }

        // reverse
        for(int i = 0; i<n;i++){
            int left = 0 ; 
            int right =n -1;
            while(left<=right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right] ;
                matrix[i][right] = temp ;
                left ++;
                right--;
            }
        }
    }
}