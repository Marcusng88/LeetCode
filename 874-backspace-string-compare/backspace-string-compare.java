class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack1 = new ArrayDeque<>();
        Deque<Character> stack2 = new ArrayDeque<>();
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(stack1.isEmpty()){
                    continue;
                }
                stack1.pop();
            }
            else{
                stack1.push(s.charAt(i));
            }
        }
        for(int j =0; j<t.length();j++){
            if(t.charAt(j)== '#'){
                if(stack2.isEmpty()){
                    continue;
                }
                stack2.pop();
            }
            else{
                stack2.push(t.charAt(j));
            }

        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.peek() != stack2.peek()){
                return false;
            }
            stack1.pop();
            stack2.pop();
        }
        if(!stack1.isEmpty() || !stack2.isEmpty()){
            return false;
        }
        return true;
    }
}