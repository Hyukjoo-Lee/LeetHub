class Solution {
    public int maxProfit(int[] prices) {
        /**
            주어진 가격 prices 가 주어졌을 때,
            주식을 사고 팔아 얻을 수 있는 최대 수익을 계산하고 반환하는 문제입니다.
            
            
            최소 가격(minPrice)을 계속 갱신하며
            현재 가격과 최소 가격의 차이를 이용해 최대 수익(maxProfit)을 계산합니다.
            만약 이익을 낼 수 없는 경우 0을 반환합니다.
         */
         
         int maxProfit = 0;
         
         // 첫 번째 날의 가격
         int minPrice = prices[0];

         // 첫 번째 날 이후의 모든 날에 대한 연산 
         for(int i = 1; i < prices.length; i++) {
             if(minPrice > prices[i]) minPrice = prices[i];
             int current = prices[i] - minPrice;
             if(maxProfit < current) maxProfit = current;
         }

         return maxProfit;
    }
}
