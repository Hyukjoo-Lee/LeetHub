class Solution {
    public int titleToNumber(String columnTitle) {
        /**
            A => 1
            B => 2
            C => 3
            ...
            Z => 26
            AA => 27
            AB => 28

            AA = (A - 'A' + 1) * 26^0
            +=   (A - 'A' + 1) * 26^1
            => 27

            AAA = (A - 'A' + 1) * 26^0
            +=    (A - 'A' + 1) * 26^1
            +=    (A - 'A' + 1) * 26^2
            => 676 + 26 + 1 = 703

            ZZ = 702

         */

         int answer = 0;
         int multiplier = 1;

         for(int i = columnTitle.length() -1; i >= 0; i--) {
             char ch = columnTitle.charAt(i);
             answer += (ch - 'A' + 1) * multiplier;
             multiplier *= 26;
         }

         return answer;
         
    }
}