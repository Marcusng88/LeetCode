class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] row = new HashSet[9];
        HashSet<Integer>[] col = new HashSet[9];
        HashSet<Integer>[] box = new HashSet[9];

        for(int x = 0; x<9 ;x++){
            row[x] = new HashSet<>();
            col[x] = new HashSet<>();
            box[x] = new HashSet<>();
            
        }

        for (int i = 0;i<9;i++){
            for(int j=0;j<9;j++){
                int  curr =(int) board[i][j];
                if (curr=='.') continue;

                int boxIndex = (i /3) * 3 + (j /3);
                if(row[i].contains(curr)) return false;
                if(col[j].contains(curr)) return false;
                if(box[boxIndex].contains(curr)) return false;

                row[i].add(curr);
                col[j].add(curr);
                box[boxIndex].add(curr);

            }
        }
        return true;

    }
}