class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int leftQ = 0;
        int rightSum = 0;
        int rightQ = 0;
        for(int i = 0 ; i<num.length() / 2;i++){
            if(num.charAt(i) == '?'){
                leftQ++;
            }
            else{
                leftSum += num.charAt(i) -'0';
            }
        }
        for(int i=num.length() / 2 ; i<num.length();i++){
            if(num.charAt(i) == '?'){
                rightQ++;
            }
            else{
                rightSum += num.charAt(i) -'0';
            }
        }
        if((leftQ + rightQ) % 2 != 0 ) return true;
        return (leftSum - rightSum) + (leftQ - rightQ) / 2 * 9 == 0 ? false : true;
        
    }
}