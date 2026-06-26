class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(),0,0,n);
        return res;
    }

    static void backtrack(List<String> res, StringBuilder path, int open, int close,int n){
        if(path.length()==2*n){
            res.add(path.toString());
            return;
        }

        if(open < n){
            path.append("(");
            backtrack(res, path, open +1, close, n);
            path.deleteCharAt(path.length()-1);
        }
        if(close < open){
            path.append(")");
            backtrack(res, path, open, close+1, n);
            path.deleteCharAt(path.length()-1);

        }


    }
}