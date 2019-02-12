class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        /* Brute Force Solution */
        int[] cover = new int[houses.length];
        for(int i = 0; i < cover.length; i++) cover[i] = Integer.MAX_VALUE;
        
        for(int heatPos = 0; heatPos < heaters.length; heatPos++)
        {
            for(int housPos = 0; housPos < houses.length; housPos++)
            {
                if(Math.abs(houses[housPos] - heaters[heatPos]) < cover[housPos])
                {
                    cover[housPos] = Math.abs(houses[housPos] - heaters[heatPos]);
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < cover.length; j++)
        {
            if(cover[j] > max) max = cover[j];
        }
        return max;
    }
}
