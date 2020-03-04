
class Stock4 {
	static int maxProfit(int k, int[] prices) {
		if(prices.length < 2) return 0;
		
		if(k > prices.length/2) {
			int profit = 0;
			for(int i = 0; i < prices.length-1; i++) {
				if(prices[i+1] > prices[i]) profit += (prices[i+1]-prices[i]);   
			}
			
			return profit;
		}
		else {
			int[][] f = new int[k+1][prices.length];
			int maxprofit = 0;
			for(int kk = 1; kk <= k; kk++) {
				int tempMax = f[k-1][0] - prices[0];
				for(int i = 1; i < prices.length; i++) {
					f[kk][i] = Math.max(f[kk][i-1], prices[i]+tempMax);
					tempMax = Math.max(tempMax, f[kk-1][i] - prices[i]);
					maxprofit = Math.max(maxprofit, f[kk][i]);
				}
			}
			return maxprofit;
		}	
	}	

	public static void main(String[] args) {
		int[] prices = new int[]{3,2,6,5,0,3};
		System.out.println(maxProfit(2, prices));
	}
}