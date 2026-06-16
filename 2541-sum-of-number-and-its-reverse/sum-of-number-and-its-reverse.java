class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i =0; i<num;i++){

            if(Integer.parseInt(getPalindome(i))+i == num){
                return true;
            }
        }
        return false;
    }
    static String getPalindome(int num){
        String res = String.valueOf(num);
        StringBuilder x = new StringBuilder(String.valueOf(num));
        return x.reverse().toString(); 
    }
}