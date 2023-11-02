class Solution {
    public boolean isPerfectSquare(int num) {
        /**
          Perfect square ?
          
          16 = 4 * 4
          True

          14 = 3.xx * 3.xx
          False
          
          1 = 1
          4 = 1 + 3
          9 = 1 + 3 + 5
          16 = 1 + 3 + 5 + 7

          
         */

         int minusValue = 1;

         while(num > 0) {
           num -= minusValue;
           minusValue += 2;
         }

         return num == 0;

         
    }
}