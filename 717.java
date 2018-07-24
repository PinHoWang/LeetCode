class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 0) return false;
        
        int index = 0;
        boolean result = false;
        while(index < bits.length) {
            if(bits[index] == 1) {
                index += 2;
                result = false;
            }
            else {
                index += 1;
                result = true;
            }
        }
        
        return result;
    }
}
