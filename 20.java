class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{' || stack.empty()) stack.push(c);
            else if(c == ')') {
                if(stack.peek() == '(') stack.pop();
                else stack.push(c);
            }
            else if(c == ']') {
                if(stack.peek() == '[') stack.pop();
                else stack.push(c);
            }
            else if(c == '}') {
                if(stack.peek() == '{') stack.pop();
                else stack.push(c);
            }
        }
        
        return stack.empty();
    }
}
