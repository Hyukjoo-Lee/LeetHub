class Solution {
    public boolean checkRecord(String s) {
        /**
        
            attendance award
            - "A" fewer than 2 days in total
            - "L" less than 3 or more 'consecutive' days

            A count < 2

            L count < 3 && not consecutive

            how to deal with the consecutive count


         */

         int absentCount = 0;
         int consecutiveLateCount = 0;

         char[] ch = s.toCharArray();

         for(char letter : ch) {
             if(letter == 'A') {
                 absentCount++;
                 consecutiveLateCount = 0;
             } else if (letter == 'L') {
                 consecutiveLateCount++;
             } else {
                consecutiveLateCount = 0;
             }

             if(absentCount >= 2 || consecutiveLateCount >= 3) {
                 return false;
             }
         }

         return true;
    }
}