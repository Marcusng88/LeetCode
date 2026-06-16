class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)== '*'){
                if(res.length()>0){
                    res.deleteCharAt(res.length()-1);
                }
            }
            else if(s.charAt(i)== '#'){
                String duplicate = res.toString();
                res.append(duplicate);
            }
            else if(s.charAt(i)== '%'){
                if(s.length()>0){
                    res.reverse();
                }
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}