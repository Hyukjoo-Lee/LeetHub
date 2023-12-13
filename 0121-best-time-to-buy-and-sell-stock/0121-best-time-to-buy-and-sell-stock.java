class Solution {
    public int maxProfit(int[] prices) {
        /**
            an array prices
            i days day

            [7,1,5,3,6,4]
                 i
                       j
             maximize the profit choosing a single to buy one stock
                                    ''    a different day in the future to sell stock

            return maxProfit 
            you cannot, return 0


            current = maxprice - minprice

         */
         
         int maxProfit = Integer.MIN_VALUE;
         int minPrice = prices[0];

         for(int i = 1; i < prices.length; i++) {
             if(minPrice > prices[i]) minPrice = prices[i];

             int current = prices[i] - minPrice;

             if(maxProfit < current) maxProfit = current;
         }
         
         if(maxProfit < 0) {
             maxProfit = 0;
         }

         return maxProfit;
    }
}