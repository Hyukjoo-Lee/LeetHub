class Solution {
    public String restoreString(String s, int[] indices) {
        /**
            codeleet = s
            45670213 = indices
            
            new char array
            char[4] = s.charAt(4)
            
            char[] answer = ['l','e','e','t','c','o','d','e']
                  
         */

         char[] answer = new char[s.length()];
         StringBuilder sb = new StringBuilder();

         for(int i = 0; i < s.length(); i++) {
             answer[indices[i]] = s.charAt(i);
         }

         for(char ch : answer) {
             sb.append(ch);
         }

         return sb.toString();
    }
}