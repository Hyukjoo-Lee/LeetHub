class Solution {
    public boolean isSubsequence(String s, String t) {
        /**
            s is subsequence of t
            relative positions?
            
            j => idxT
            i => idxS
            abcde
            ace (true)
                j
              i - when i reaches at the length of s string, check the if idxS == length
            aec (false)
                j - when j reaches at the length of t string, but i is not, false
              i
         */

        char[] charArrS = s.toCharArray();
        char[] charArrT = t.toCharArray();

        int idxS = 0;

        // abcde
        // ace 
        //      T
        //    S 
        for(int idxT = 0; idxT < charArrT.length && idxS < charArrS.length; idxT++) {
            if(charArrS[idxS] == charArrT[idxT]) {
                idxS++;
            }
        }

        return idxS == charArrS.length;










    }
}