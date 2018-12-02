class Solution {
    public int maxArea(int[] height) {
        /* Brute Force, faster than 11.64%
        if(height.length == 0) return 0;
        
        int max = 0;
        for(int i = 0; i < height.length; i++) {
            int parMax = 0;
            for(int j = i+1; j < height.length; j++) {
                parMax = Math.max(Math.min(height[i], height[j]) * (j-i), parMax);
            }
            max = Math.max(max, parMax);
        }
        
        return max;
        */
        
        // Using two pointers to record MAX value, faster than 99.55%
        if(height.length == 0) return 0;
        
        int max = 0;
        int i = 0, j = height.length-1;
        while(i < j) {
            max = Math.max(Math.min(height[i], height[j]) * (j-i), max);
            if(height[i] < height[j]) i++;
            else j--;
        }
        
        return max;
    }
}
