
/** 
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.
**/

class Stock1 {
	static int maxProfitBF(int[] prices) {
		int maxprofit = 0;
		for(int i = 0; i < prices.length; i++) {
			for(int j = i; j < prices.length; j++) {
				if(prices[j] - prices[i] > maxprofit)
					maxprofit = prices[j] - prices[i];
			}
		}

		return maxprofit;
	}

	/*
	 * In this problem, we just buy and sell one time.
	 * It can say that find the lowest valley to buy
	 * and the highest peak to sell
	*/
	static int maxProfit(int[] prices) {
		int maxprofit = 0;
		int min = 0;
		for(int p : prices) {
			if(p < min) min = p;
			else if(p - min > maxprofit) {
				maxprofit = p - min;
			}
		}

		return maxprofit;
	}

	public static void main(String[] args) {
		int[] prices = new int[]{7,6,4,3,1};
		// System.out.println(maxProfitBF(prices));	
		System.out.println(maxProfit(prices));	
	}
}