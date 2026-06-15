class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        ArrayList<StringBuilder> res1 = new ArrayList<>();
        for(int j = 0;j<numRows;j++){
            StringBuilder x = new StringBuilder();
            res1.add(x);
        }
        boolean goingDown = true;
        int row =0;
        for(int i = 0; i<s.length();i++){
            if(goingDown){
                res1.get(row).append(s.charAt(i));
                if(row==numRows-1){
                    goingDown = false;
                    row--;
                }
                else{
                    int currentRow = row+1;
                    row = Math.min(currentRow, numRows-1);
                }
            }
            else{
                res1.get(row).append(s.charAt(i));
                if(row==0){
                    goingDown = true;
                    row++;
                }
                else{
                    int currentRow2 = row-1;
                    row = Math.max(currentRow2, 0);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder x: res1){
            res.append(x);
        }
        return res.toString();
    }
}