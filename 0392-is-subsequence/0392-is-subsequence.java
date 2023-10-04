class Solution {
    public boolean isSubsequence(String s, String t) {
        /**
            I thought set would be one data structure can be utilized 
            but, we should consider the relative positions of the characters
            two pointer?
            we need to set a kind of position rule for i, j pointer
    
            abcde j = 5
            aec 
            j = 0;
            j charT[j] charT[4]
            i charS[i] charS[1]
            for(int i = 0; i < char.length; i++)
            if(i+j < charT.length && charS[i] == charT[i+j]) {
                i++;
                j++;
            } else if (charS[i] != charT[i+j]) {
                j++;
            } else {
                return false;
            }
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










