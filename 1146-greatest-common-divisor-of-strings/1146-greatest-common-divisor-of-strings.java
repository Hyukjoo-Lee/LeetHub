class Solution {
    public String gcdOfStrings(String str1, String str2) {
        /**
            if !str1.contains(str2) return ""
            ABABAB / ABAB => AB

            str1 % str2 ?
            substring(i,j)

            ABCABC + ABC = ABCABCABC
            ABC + ABCABC = ABCABCABC

            LEET + CODE = LEETCODE
            CODE + LEET = CODELEET

            ABABABC
            ABAB

            !(str1 + str2).equals(str2 + str1) return "";

         */
         if(!(str1 + str2).equals(str2 + str1)) {
             return "";
         }

         int shortLength = 0;
         int longerLength = 0;

         if(str1.length() > str2.length()) {
             shortLength = str2.length();
             longerLength = str1.length();
         } else {
             shortLength = str1.length();
             longerLength = str2.length();
         }
         // str1 = "ABCABC", str2 = "ABC"

         // short = 3
         // long = 6
         // 6 % 3 = 0
         int i = shortLength;

         while(i >= 1) {
             if(longerLength % i == 0 && shortLength % i == 0) {
                break; 
             }
             i--;
         }
         
         
         return str1.substring(0,i);
         
    }
}