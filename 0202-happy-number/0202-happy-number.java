class Solution {
    public boolean isHappy(int n) {
        /**
            Happy Number condition
            1. starting with n, replace the number by "the sum of the squares" of its digits
            if n = 19,
               n = 1 * 1 + 9 * 9 = 82
            2. Repeat the process until the number equals 1
            OR it loops endlessly in a cycle which does not include 1
            3. ends in 1, return true, otherwise false

            n = 7
            n = 49
            n = 4 * 4 + 9 * 9 = 16 + 81 = 97
            n = 9 * 9 + 7 * 7 = 81 + 49 = 130
            n = 1 + 9 + 0 = 19
            n = 1 + 81 = 82

         */
         Set<Integer> set = new HashSet<>();

         while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSum(n);
         }

         return n == 1;
    }

    private int getSum(int n) {
        
        int sum = 0;

        while(n > 0) {
            int d = n % 10; // 2
            n = n / 10; // 2 / 10 = 0
            sum += d*d; // 4
        }

        return sum;
    }
}