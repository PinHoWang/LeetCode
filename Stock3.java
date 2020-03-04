
import java.util.*;

class Stock3 {
	
	/*
	 * K: number of transection we can take
	 * f[k][ii]: 到prices[ii]之前得最大獲利
	 * f[k][ii] = Math.max(f[k][ii-1], 
	 *							prices[ii] - prices[jj] + f[k-1][jj])
	 * 兩種情況：
	 * 	1. 沒有買賣，和f[k][ii-1]一樣
	 *	2. 從prices[ii]買入到prices[jj]的賣出 + 上次在prices[jj]之前交易的最大獲利(f[k-1][jj])
	 *	兩個中取最大值
	 *
	 * f[0][ii] = 0: 0 times transation, 0 profit
	 * f[k][0] = 0: Only one price, can not make profit at all 
	*/

	static int maxProfit(int[] prices) {
		if(prices.length <= 1) return 0;
		
		int K = 2;
		int maxprofit = 0;
		int[][] f = new int[K+1][prices.length];
		for(int kk = 1; kk <= K; kk++) {
			int tempMax = f[kk-1][0] - prices[0];
			for(int ii = 1; ii < prices.length; ii++) {
				f[kk][ii] = Math.max(f[kk][ii-1], prices[ii]+tempMax);
				tempMax = Math.max(tempMax, f[kk-1][ii] - prices[ii]);
				maxprofit = Math.max(f[kk][ii], maxprofit);
			}
		}

		return maxprofit;
	}	


	public static void main(String[] args) {
		int[] prices = new int[]{1,2,3,4,5};
		System.out.println(maxProfit(prices));
	}
}