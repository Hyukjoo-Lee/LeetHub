class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {

        /**
        
            the shortest distance between these two words in the array

            wordsDict = 
            ["practice", "makes", "perfect", "coding", "makes"]
                0           1         2         3         4
            word1 = "coding", word2 = "practice"
            output abs(0 - 3) = 3

            wordsDict = 
            ["practice", "makes", "perfect", "coding", "makes"]
                0           1         2         3         4
            word1 = "makes", word2 = "coding"
            output abs(1 - 3) = 2
                   abs(3 - 4) = 1
                   1

            index manipulation

            Math.min(abs(i - j))

         */

         int minDistance = Integer.MAX_VALUE;
         int word1Idx = -1;
         int word2Idx = -1;

         for(int i = 0; i < wordsDict.length; i++) {
             
             if(wordsDict[i].equals(word1)) {
                 word1Idx = i;
             }

             if(wordsDict[i].equals(word2)) {
                 word2Idx = i;
             }

             // how to detect the both words are found
             if(word1Idx != -1 && word2Idx != -1) {
                 minDistance = Math.min(minDistance, Math.abs(word1Idx - word2Idx));
             }

         }

         return minDistance;









        
    }
}