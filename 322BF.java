class Solution {
    public int coinChange(int[] coins, int amount) {
        return helper(0, coins, amount);
    }
    
    private int helper(int idxOfCoin, int[] coins, int amount) {
        if(amount == 0) return 0;
        
        if(idxOfCoin < coins.length && amount > 0) {
            int maxVal = amount / coins[idxOfCoin];
            int minCost = Integer.MAX_VALUE;
            for(int i = 0; i <= maxVal; i++) {
                if(amount >= i * coins[idxOfCoin]) {
                    int res = helper(idxOfCoin+1, coins, amount - (i*coins[idxOfCoin]));
                    if(res != -1) minCost = Math.min(minCost, res + i);
                }
            }
            return (minCost == Integer.MAX_VALUE) ? -1 : minCost;
        }
        return -1;
    }
}
