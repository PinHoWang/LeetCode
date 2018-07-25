class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int min = prices[0];
        int profit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            if (price > min) {
                profit += (price - min);
                min = price;
            }
        }
        return profit;
    }
}
