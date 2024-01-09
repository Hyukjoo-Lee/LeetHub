class Solution {
    public int reverse(int x) {
        /**
            reverse the digit 'x'; the digits of 32-bit signed...
            if the overflow occurs, return 0

            we need to see if the x is negative first
         */

         // check if x is negative
         boolean isNegative = x < 0;
         // use long to check for overflow
         x = Math.abs(x);

         long reversed = 0;
         
         // if overflow ...
         // the problem is that the overflow can be occured while reversing..
         while(x != 0) {
            int d = x % 10;
            x = x / 10;
            reversed = reversed * 10 + d; 
         }

         if(reversed <= Integer.MIN_VALUE || reversed > Integer.MAX_VALUE - 1) {
             return 0;
         }

         if(isNegative) {
             reversed = -reversed;
         }

         return (int)reversed;
    }
}