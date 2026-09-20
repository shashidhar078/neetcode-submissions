class Solution {
    public int maxProfit(int[] prices) {
        //through sliding two pointer
        int maxp=0;

        int l=0;
        int r=1;

        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                int profit=prices[r]-prices[l];
                maxp=Math.max(profit,maxp);
            }
            else
            {
                l=r;
            }
            r++;
        }
        return maxp;
    }
}
