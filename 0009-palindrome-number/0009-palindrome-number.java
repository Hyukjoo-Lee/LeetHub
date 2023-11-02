class Solution {
    public boolean isPalindrome(int x) {
        /**
        
            Palindrome number

            121

            -121 false

            10 false

            covert int to string

            
         */


         String str = Integer.toString(x);
        //  System.out.println(str);
         StringBuilder sb = new StringBuilder(str);
         String reversedStr = sb.reverse().toString();
        //  System.out.println(reversedStr);
         return str.equals(reversedStr);
    }
}