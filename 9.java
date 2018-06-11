class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x / 10 == 0) return true;
        if(x % 10 == 0) return false;
        
        // Calculate digits
        int digit = 0;
        while(true) {
            if(x / (long) (Math.pow(10, digit)) == 0) { break; }
            digit++;
        }
        
        long p = 0;
        int n = x;
        for(int i = digit; i > 0; i--) {
            p += (n % 10) * Math.pow(10, i-1);
            n = n / 10;
        }
        return ((long) x == p);
    }
}
