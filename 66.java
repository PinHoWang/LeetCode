class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] < 9) {
            digits[digits.length-1] += 1;
            return digits;
        }
        
        int temp = 1;
        for(int i = digits.length-1; i >= 0; i--) {
            int sum = digits[i] + temp;
            if(sum >= 10) {
                digits[i] = 0;
                temp = 1;
            }
            else {
                digits[i] = sum;
                temp = 0;
                break;
            }
        }
        
        if(temp == 0) return digits;
        else {
            int[] result = new int[digits.length + temp];
            result[0] = 1;
            for(int j = 1; j < result.length; j++) {
                result[j] = digits[j-1];
            }
            return result;
        }
    }
}
