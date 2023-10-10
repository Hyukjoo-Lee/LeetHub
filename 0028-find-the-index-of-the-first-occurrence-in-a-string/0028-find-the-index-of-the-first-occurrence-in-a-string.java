class Solution {
    public int strStr(String haystack, String needle) {
        /**
            needle
            haystack

            return the index of the first occurrence of needle inside haystack
            or -1

            stack - 5
            haystack 8
            
            substring - utilzing the each length
            if(substring(5,8).equals(stack))
            return 5
         */
         //    stack
         // haystack = 8
         // index = 3
         int n = haystack.length();
         int m = needle.length();

         for(int i = 0; i <= n - m; i++) {
             if(haystack.substring(i, i + m).equals(needle)) return i;
         }
         
         return -1;
         
    }
}