class Solution {
    public boolean judgeCircle(String moves) {
        int[] origin = {0,0} ;
        for(int i = 0;i<moves.length();i++){
            if (moves.charAt(i)=='R'){
                origin[0] ++;
            }
            else if (moves.charAt(i)=='L'){
                origin[0] --;
            }
            else if (moves.charAt(i)=='U'){
                origin[1] ++;
            }
            else if (moves.charAt(i)=='D'){
                origin[1] --;
            }
        }
        return origin[0] == 0 && origin[1] == 0;
    }
}