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

        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

         
    }
}