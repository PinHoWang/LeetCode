class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("+")) {
                Integer first = st.pop();
                Integer second = st.peek();
                st.push(first);
                st.push(first + second);
            }
            else if(ops[i].equals("D")) {
                st.push(2 * st.peek());
            }
            else if(ops[i].equals("C")) {
                st.pop();
            }
            else {
                // Integer
                st.push(Integer.parseInt(ops[i]));
            }
        }
        
        Integer total = 0;
        while(!st.empty()) {
              total += st.pop(); 
        }
        
        return (int) total;
    }
}
