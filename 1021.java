class Solution {
    public String removeOuterParentheses(String S) {
        if(S == null || S.length() == 0) return "";
        
        List<String> primitives = spiltPrimitive(S);
        
        String result = "";
        for(String s : primitives) {
            result += s.substring(1, s.length()-1);
        }
        
        return result;
    }
    
    private List<String> spiltPrimitive(String s) {
        List<String> primitives = new ArrayList<String>();
        if(s == null) return primitives;
        
        char[] cc = s.toCharArray();
        
        Stack<Boolean> stack = new Stack<>();
        String prim = "";
        for(char c : cc) {
            prim += c;
            if(c == '(') stack.push(true);
            else stack.pop();
            
            if(stack.empty()) {
                primitives.add(prim);
                prim = "";
            }
        }
        
        return primitives;
    }
}
