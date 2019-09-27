class Solution {
    public boolean canPermutePalindrome(String s) {
        if(s == "") return false;
        
        // There two differents palindromes:
        //     1. Even chars in string
        //         * Each char appear even times
        //     2. Odd chars in string
        //         * Each char appear even times and only one char appear single time
        // String may contain uppercase chars
        
        int[] counter = new int[128];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counter[((int) c)]++;
        }
        
        int contrain = 0;
        for(int j : counter) {
            if(j % 2 != 0) contrain++;
        }
        
        return (contrain < 2);
    }
}
