class Solution {
    public String addBinary(String a, String b) {
        /**
            11 => 3
             1 => 1
           100  => 4
           binary 10

           round


         */
         
         char[] chA = a.toCharArray();
         char[] chB = b.toCharArray();

         StringBuilder sb = new StringBuilder();
         int round = 0;

         int endIdxA = chA.length -1;
         int endIdxB = chB.length -1;

         int c = 0;
         int d = 0;

         while(endIdxA >= 0 || endIdxB >= 0) {

            if(endIdxA >= 0) {
              c = chA[endIdxA] - '0';
            } else {
              c = 0;
            }
            
            if(endIdxB >= 0) {
              d = chB[endIdxB] - '0';
            } else {
              d = 0;
            }

            int sum = c + d + round;
            sb.insert(0, sum % 2);

            if(sum > 1) {
              round = 1;
            } else {
              round = 0;
            }

            endIdxA--;
            endIdxB--;
         }

         if(round > 0) {
           sb.insert(0,1);
         }
         return sb.toString();
         
    }
}