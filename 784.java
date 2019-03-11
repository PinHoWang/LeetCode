class Solution {
    public List<String> letterCasePermutation(String S) {
        if(S == null) return new ArrayList<>();
        
        List<String> result = new ArrayList<>();
        helper(S.toCharArray(), result, 0);
        return result;
    }
    
    private void helper(char[] c, List<String> result, int pos) {
        if(pos == c.length) {
            result.add(new String(c));
            return;
        }
        
        if(c[pos] >= '0' && c[pos] <= '9') {
            helper(c, result, pos+1);
            return;
        }
        
        c[pos] = Character.toUpperCase(c[pos]);
        helper(c, result, pos+1);
        
        c[pos] = Character.toLowerCase(c[pos]);
        helper(c, result, pos+1);
    }
}
