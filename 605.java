class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 0) return false;
        if(n == 0) return true;
        if(flowerbed.length == 1) return (flowerbed[0] == 1) ? false : true;
        
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                if(i == 0) {
                    if(flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        count++;
                    }
                }
                else if(i == flowerbed.length-1) {
                    if(flowerbed[flowerbed.length-2] == 0) {
                        flowerbed[i] = 1;
                        count++;
                    }
                }
                else {
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        count++;
                    }
                }
            }
        }
        
        return n <= count;
    }
}
