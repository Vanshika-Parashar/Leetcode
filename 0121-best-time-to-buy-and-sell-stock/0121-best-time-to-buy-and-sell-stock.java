class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int minp=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minp;
            max=Math.max(profit,max);
            minp=Math.min(minp,prices[i]);
        }
        return max;

    }
}
