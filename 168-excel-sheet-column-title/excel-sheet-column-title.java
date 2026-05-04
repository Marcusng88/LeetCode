class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber>0){
            columnNumber --;
            int temp = columnNumber % 26;
            char character = (char) (temp + 'A');
            res.append(String.valueOf(character));
            columnNumber /= 26 ;
        }
        String x = res.reverse().toString();
        return x;

    }
}