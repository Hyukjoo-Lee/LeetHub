class Solution {
    public boolean isAnagram(String s, String t) {
        /**
            simply sort the s and t
            and determine if both strings are equal
            
            HashMap (count char)
         */

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String sortedStS = new String(ch1);
        String sortedStT = new String(ch2);

        return sortedStS.equals(sortedStT);
    }
}