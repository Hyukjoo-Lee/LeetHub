class Solution {
    public boolean repeatedSubstringPattern(String s) {
        /**
            "abab"
            substring ab can construct "abab"
            
            "aba"
        
            how to check there is a pattern in a string?

         */

         int lastIndex = s.length(); // excluded

         StringBuilder sb = new StringBuilder();

         sb.append(s);
         sb.append(s);

         String doubledString = sb.toString();
         String slicedString = doubledString.substring(1,doubledString.length()-1);
         return slicedString.contains(s);
    }
}