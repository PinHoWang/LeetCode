class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        /** Find the min cost to travel every day in the given list of days
        /* 1. How to determind min of cost?
        /*      create a dp[] to record the min every day
                Loop the days, if the day corresponds to days[j] check whether we can alter it w/ 7-days 
                or 30-days tickets.
                dp[i] = min(dp[max(0, i-7 or i-30)], dp[i-1] + costs[1 or 2])
        **/
        
        int[] dp = new int[days[days.length-1] + 1];
        int j = 0;
        for(int i = days[0]; i <= days[days.length-1]; i++) {
            if(days[j] == i) {
                dp[i] = dp[i-1] + costs[0];
                dp[i] = Math.min(dp[Math.max(0, i-7)] + costs[1], dp[i]);
                dp[i] = Math.min(dp[Math.max(0, i-30)] + costs[2], dp[i]);
                j++;
            }
            else {
                dp[i] = dp[i-1];
            }
        }
        
        return dp[dp.length-1];
        
    }
}
