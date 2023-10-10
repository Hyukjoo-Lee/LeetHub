class Solution {
    public void reverseString(char[] s) {
        /**
            reverse the given string 
            in-place
            O(1)

            reverse function..
            or
            two pointers / stack
         */

         StringBuilder sb = new StringBuilder();

         for(char ch : s) {
             sb.append(ch);
         }

         String reversedString = sb.reverse().toString();
         
         for(int i = 0; i < reversedString.length(); i++) {
             s[i] = reversedString.charAt(i);
         }
         
    }
}