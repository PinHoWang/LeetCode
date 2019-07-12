class Solution {
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int count = 0;
        for(int i = 0; i < s.length(); i++)
            for(int j = i+1; j < s.length()+1; j++) {
                if(isPalindromic(s.substring(i, j))) count++;
            }
        return count;
    }
    
    private boolean isPalindromic(String s) {
        if(s.length() == 1) return true;
        
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}
