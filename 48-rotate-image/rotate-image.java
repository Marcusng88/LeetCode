class Solution {
    public void rotate(int[][] matrix) {
        // transform
        boolean[][] swap = new boolean[matrix.length][matrix.length];
        for(int row = 0; row<matrix.length;row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(!swap[row][col]){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                    swap[row][col] = true;
                    swap[col][row] = true;
                }
                
            }
        }

        // reverse
        for(int i = 0; i<matrix.length;i++){
            int left = 0 ; 
            int right = matrix[i].length -1;
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