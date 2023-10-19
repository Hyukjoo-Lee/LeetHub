class Solution {
    public String addBinary(String a, String b) {
        /**
            11 => 3 (1+2)
            1 => 1 (1)
            3+1 = 4
            output: "100"

            1010 => 10
            1011 => 11
            10+11 = 21
            21 = 16 + 4 + 1 
            output: 10101
            
            11
             1
            12 
           100
            1
           1010
           1011
          10101            
          
          2 % 2 = 0
          next = 1
          if sum = 2
          next = 1
          

          a.charAt(i) == 0
          b.chatAt(i) == 0
          output         1?
          11
          011  3
          111  7
         1010  10

          a.charAt(i) == 1
          b.chatAt(j) == 1
          output         0?
          output(i+1) =  1?

          if a.length() > b.length(),
          if b.length() > a.length()

         not contain leading zeros except for the zero itself
            
         */

            char[] chA = a.toCharArray();
            char[] chB = b.toCharArray();
            
            int endA = chA.length - 1;
            int endB = chB.length - 1;
            
            StringBuilder sb = new StringBuilder();
            int round = 0;
            
            while (endA >= 0 || endB >= 0) {
                
                int z = (endA >= 0) ? chA[endA] - '0' : 0;
                int x = (endB >= 0) ? chB[endB] - '0' : 0;
            
                int sum = z + x + round;
            
                sb.insert(0, sum % 2);
            
                if (sum > 1) {
                    round = 1;
                } else {
                    round = 0;
                }
            
                endA--;
                endB--;
            }
            
            if (round > 0) {
                sb.insert(0, 1);
            }
            
            return sb.toString();

    }
}