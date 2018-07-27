class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        
        int max = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                int profit = prices[j]-prices[i];
                if(profit > 0 && profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }
}
