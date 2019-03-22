class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s == "" || s.length() == 0) return 0;
        
        int longest = Integer.MIN_VALUE;
        for(int i = 0; i < s.length()-1; i++) {
            int[] count = new int[128];
            int j = i;
            while(j < s.length()) {
               count[s.charAt(j)]++;
                if(count[s.charAt(j)] > 1) break;
                j++;
            }
            if(longest == Integer.MIN_VALUE) longest = j-i;
            else longest = Math.max(longest, j-i);
        }
        
        return (longest == Integer.MIN_VALUE) ? 1 : longest;
    }
}
