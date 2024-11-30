class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length()==1) return 1;
        if (s.length()==0 || s==null) return 0;
        int i = s.length()-1;

        while(s.charAt(i)==' '){
            i--;
        }
        int count =0;
        for (int j = i;j>=0;j--){
            if(s.charAt(j)!=' '){
                count ++;
            }
            else{
                break;
            }
        }
        return count;
        
    }
}