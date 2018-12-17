class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0 || s == null) return 0;
        
        int i = 0, sum = 0;
        boolean flag = true;
        while(i < s.length()) {
            if(i == s.length() - 1) flag = false;
            if(s.charAt(i) == 'I') {
                if(flag && s.charAt(i+1) == 'V') {
                    sum += 4;
                    i += 2;
                }
                else if(flag && s.charAt(i+1) == 'X') {
                    sum += 9;
                    i += 2;
                }
                else {
                    sum += 1;
                    i += 1;
                }
            }
            else if(s.charAt(i) == 'V') {
                sum += 5;
                i += 1;
            }
            else if(s.charAt(i) == 'X') {
                if(flag && s.charAt(i+1) == 'L') {
                    sum += 40;
                    i += 2;
                }
                else if(flag && s.charAt(i+1) == 'C') {
                    sum += 90;
                    i += 2;
                }
                else {
                    sum += 10;
                    i += 1;
                }
            }
            else if(s.charAt(i) == 'L') {
                sum += 50;
                i += 1;
            }
            else if(s.charAt(i) == 'C') {
                if(flag && s.charAt(i+1) == 'D') {
                    sum += 400;
                    i += 2;
                }
                else if(flag && s.charAt(i+1) == 'M') {
                    sum += 900;
                    i += 2;
                }
                else {
                    sum += 100;
                    i += 1;
                }
            }
            else if(s.charAt(i) == 'D') {
                sum += 500;
                i += 1;
            }
            else {
                sum += 1000;
                i += 1;
            }
        }
        
        return sum;
    }
}
