class Solution {
    public int titleToNumber(String s) {
        if(s.length() == 0 || s == null) return 0;
        
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum += Math.pow(26, s.length()-i-1) * (s.charAt(i)-64);
        }
        return sum;
    }
}
