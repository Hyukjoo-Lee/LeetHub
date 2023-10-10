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

         Stack<Character> stack = new Stack<>();

         for(char ch : s) {
             stack.push(ch);
         }
        
         int i = 0;
         while(!stack.isEmpty()) {
             s[i++] = stack.pop();
         }
    }
}