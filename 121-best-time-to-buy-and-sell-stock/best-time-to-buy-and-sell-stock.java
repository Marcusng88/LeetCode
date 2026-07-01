class Solution {
    public int maxProfit(int[] prices) {
        // dp approach , slower compared to other o(n) solutions as need time to construct the dp array

        // int[] dp = new int[prices.length+1];
        // dp[1] = 0;
        // int res = 0;

        // for(int i = 2; i<dp.length;i++){
        //     dp[i] = Math.max(0, dp[i-1] + prices[i-1] - prices[i-2]);
        //     res = Math.max(res, dp[i]);
        // }

        // return res;

        // greedy algo approach , faster
        int min  = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices){
            min = Math.min(price, min);
            maxProfit = Math.max(maxProfit, price - min);
        }
        return maxProfit;

    }
}