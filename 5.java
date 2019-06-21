class Solution {
    public String longestPalindrome(String s) {
        int start = 0, maxLength = 0;
        
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        
        for(int i = length - 1; i >= 0; i--) {
            for(int j = i; j < length; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1]);
                
                if(dp[i][j] && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    start = i;
                }
            }
        }
        
        return s.substring(start, start + maxLength);
    }
}
