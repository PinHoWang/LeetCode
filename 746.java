class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0) return 0;
        
        int[] min = new int[cost.length];
        min[0] = cost[0];
        min[1] = cost[1];
        for(int i = 2; i < cost.length; i++) {
            min[i] = cost[i] + Math.min(min[i-1], min[i-2]);
        }
        
        return Math.min(min[min.length-1], min[min.length-2]);
        
    }
}
