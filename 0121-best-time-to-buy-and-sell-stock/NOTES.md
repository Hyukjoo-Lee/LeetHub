```java
​class Solution {
    public int maxProfit(int[] prices) {
        /**
            주어진 가격 prices 가 주어졌을 때,
            주식을 사고 팔아 얻을 수 있는 최대 수익을 계산하고 반환하는 문제입니다.
            
            
            최소 가격(minPrice)을 계속 갱신하며
            현재 가격과 최소 가격의 차이를 이용해 최대 수익(maxProfit)을 계산합니다.
            만약 이익을 낼 수 없는 경우 0을 반환합니다.

            첫 번째 날의 가격을 0 으로 initilize 하고
            배열을 순회하면서 각 날에 대해 수익을 낼 수 있는 값을 계산 합니다. (current)
            최대 수익보다 current profit 이 큰 경우 최대 수익을 current로 갱신 합니다.

            배열이 끝난 최대 수익을 반환합니다.

            시간 복잡도는 O(N) 입니다. n 은 prices.length 입니다.
            공간 복잡도는 O(1) 입니다. minPrice와 maxProfit 두 개의 변수만을 사용하여 문제를 해결하기 때문입니다.
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
```

