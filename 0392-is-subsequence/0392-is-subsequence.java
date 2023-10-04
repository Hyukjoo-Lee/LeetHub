class Solution {
    public boolean isSubsequence(String s, String t) {
        /**
            We need to set a kind of position rule for i, j pointer
            i => s index
            j => t index

            axc
            axcgdc
              i
              j
           i == s.length means s is a subsequence of t !
         */
        
        char[] charArrS = s.toCharArray(); // axc
        char[] charArrT = t.toCharArray(); // ahdgdc

        int sIdx = 0;

        for(int tIdx = 0; tIdx < charArrT.length && sIdx < charArrS.length; tIdx++) {
            if(charArrS[sIdx] == charArrT[tIdx]) {
                sIdx++;
            }
        }
        
        return sIdx == charArrS.length;

    }
}










