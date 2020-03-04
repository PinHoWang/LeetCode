
/**
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
(i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
**/


class Stock2 {

	// Traverse the prices list, find out the locally valley to buy
	// find out the locally peak to sell
	static int maxProfitBF(int[] prices) {
		int maxprofit = 0;
		int valley = prices[0], peak = prices[0];
		int i = 0;
		while(i < prices.length-1) {
			while(i < prices.length-1 && prices[i] >= prices[i+1])
				i++;
			valley = prices[i];
			while(i < prices.length-1 && prices[i] <= prices[i+1])
				i++;
			peak = prices[i];

			maxprofit += peak - valley;
		}

		return maxprofit;
	}	
	

	public static void main(String[] args) {
		int[] prices = new int[]{7,6,4,3,1};
		System.out.println(maxProfitBF(prices));
	}	
}