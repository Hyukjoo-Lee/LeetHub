class Solution {
    public String makeGood(String s) {
        /**
            s - lower and upper case letters

            0 <= i <= s.length -2
            s[i] is a lower-case letter and s[i+1] is the same letter but in upper-case

            choose two adjacent characters

            if bad, remove them


         */

        if(s.length() < 2) return s;
         
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while(i <= sb.length() - 2) {
            boolean isSameButUpper = (Character.toUpperCase(sb.charAt(i)) == Character.toUpperCase(sb.charAt(i + 1)));
            boolean isNotSameLetter = (sb.charAt(i) != sb.charAt(i+1));

            // System.out.println(isSameButUpper);
            // System.out.println(isNotSameLetter);
            if(isSameButUpper && isNotSameLetter) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = 0;
            } else {
                i++;
            }
        }

        return sb.toString();

         
    }
}