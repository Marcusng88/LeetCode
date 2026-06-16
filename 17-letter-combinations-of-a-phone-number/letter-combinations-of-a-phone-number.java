class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> results = new ArrayList<>();
        StringBuilder path = new StringBuilder();

        backtrack(map, 0, digits, path, results);
        return results;
    }

    static void backtrack(HashMap<Character,String> map, int idx,String digits,StringBuilder path, List<String> results){
        if(path.length()==digits.length()){
            results.add(path.toString());
            return;
        }
        char digit = digits.charAt(idx);
        String letters = map.get(digit);

        for(int i = 0;i<letters.length();i++){
            path.append(letters.charAt(i));
            backtrack(map, idx+1, digits, path, results);
            path.deleteCharAt(path.length()-1);
        }

    }
}