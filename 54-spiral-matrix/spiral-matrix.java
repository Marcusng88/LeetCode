class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int total = rows * cols;
        boolean[][] visited = new boolean[rows][cols];

        int[][] directions = {
            // right , down , left , up
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };
        // 3x3 matrix
        // 00 01 02 12 22 21 20 10 11


        List<Integer> res = new ArrayList<>();
        int row = 0;
        int col = 0;
        int direction = 0;
        
        while(res.size()<total){
            res.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + directions[direction][0];
            int nextCol = col + directions[direction][1];
            boolean outOfBound = (
                nextRow>=rows
                || nextCol>=cols
                || nextRow<0
                || nextCol<0
            );
            if(outOfBound || visited[nextRow][nextCol]){
                direction  =( direction + 1 ) % 4;
                nextRow = row + directions[direction][0];
                nextCol = col + directions[direction][1];
            }

            row = nextRow;
            col = nextCol;
        }
        return res;
        
    }
}