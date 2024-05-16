class Solution {
    public boolean isPalindrome(String s) {
        /**
            1. coverting all uppercase into lowercase

            2. remove all non-alphanumeric

            3. includes letters and numbers 
        
         */

         int start = 0;
         int end = s.length() -1;

         while(start < end) {
            char startCh = Character.toLowerCase(s.charAt(start));
            char endCh = Character.toLowerCase(s.charAt(end));
             if(!Character.isLetterOrDigit(startCh) && !Character.isLetterOrDigit(endCh)) {
                 start++;
                 end--;
             } else if(!Character.isLetterOrDigit(startCh)) {
                 start++;
             } else if(!Character.isLetterOrDigit(endCh)) {
                 end--;
             } else {
                if(startCh != endCh) return false;
                start++;
                end--;
             }
         }

         return true;
        
    }
}