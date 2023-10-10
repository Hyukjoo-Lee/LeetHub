class Solution {
    public int maxProfit(int[] prices) {
        /**
          buy before you sell
          maximize the profit
          prices = [7,1,5,3]
          profit = prices[j] - prices[i]
          only using one loop?

          find the min
          find the max
          
          calculate and update max
          
          return max
         */

         int max = 0;
         int min = prices[0];
        
        for(int i = 1; i < prices.length; i++) {
            if(min > prices[i]) min = prices[i];
            
            int newMax = prices[i] - min;

            if(max < newMax) {
                max = newMax;
            }
            
        }

        return max;









    }
}