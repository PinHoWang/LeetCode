class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        /* Brute Force Solution */
//         int[] cover = new int[houses.length];
//         for(int i = 0; i < cover.length; i++) cover[i] = Integer.MAX_VALUE;
        
//         for(int heatPos = 0; heatPos < heaters.length; heatPos++)
//         {
//             for(int housPos = 0; housPos < houses.length; housPos++)
//             {
//                 if(Math.abs(houses[housPos] - heaters[heatPos]) < cover[housPos])
//                 {
//                     cover[housPos] = Math.abs(houses[housPos] - heaters[heatPos]);
//                 }
//             }
//         }
        
//         int max = Integer.MIN_VALUE;
//         for(int j = 0; j < cover.length; j++)
//         {
//             if(cover[j] > max) max = cover[j];
//         }
//         return max;
        
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int i = 0, result = 0;
        for(int house : houses)
        {
            while(i < heaters.length-1 && (Math.abs(heaters[i]-house) >= Math.abs(heaters[i+1] - house)))
            {
                i++;
            }
            result = Math.max(result, Math.abs(heaters[i] - house));
        }
        return result;
    }
}
