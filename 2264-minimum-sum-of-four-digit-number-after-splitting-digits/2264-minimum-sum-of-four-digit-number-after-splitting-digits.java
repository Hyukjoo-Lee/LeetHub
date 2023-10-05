class Solution {
    public int minimumSum(int num) {
        /**
            2932
            2,9,3,2
            29 + 32 = 61
            29 + 23 = 52
            ....
            223 + 9 = ..
            decimal 
            while(n > 0)
            decimal n = 29 / 10 = 2
            digit d = 29 % 10 = 9
            array[i] = d

            [2,9,3,2]
            sort
            2 2 3 9
            (d1 + d2) * 10 = decimal
            (d3 + d4) = digit 
         */

        // 1000 <= num <= 9999
        int[] digits = new int[4];
        
        // 2932
        // [0,0,0,0]
        int i = 0;

         while(num > 0) {
            int d = num % 10; // 2 , 3, 9, 2
            num = num / 10; // 293, 29, 2 ,0
            digits[i++] = d;
         }

        // [2,3,9,2]
        Arrays.sort(digits);
        // [2, 2, 3, 9]
        //  d1,d2,d3,d4
        // 10 * (2+2) = 40
        int sum1 = 10 * (digits[0] + digits[1]);
        // 3 + 9 = 12
        int sum2 = digits[2] + digits[3];

        return sum1 + sum2;















    }
}