class Solution {
    public boolean isPalindrome(String s) {
        /**
            1. converting all uppercase letters into lowercase
            2. removing all non-alphanumeric characters
            3. reads the same forward and backward

            "race a car"

            start = 0;
            end = s.length -1

         */
        
        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            char a = s.charAt(start);
            char b = s.charAt(end);

            if(!Character.isLetterOrDigit(a)) {
                start++;
            } else if(!Character.isLetterOrDigit(b)) {
                end--;
            } else {
                if(Character.toLowerCase(a) == Character.toLowerCase(b)) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
        }

        return true;

    }
}













