class Solution {
    public int minDeletions(String s) {
        /**
            If there are no two different chars in s 
            and have the same frequency, s is good

            return the min number of chars you need to delete in order to make s good
            
            the number of characters should be no more than 2
            
            aaabbbcc

            a:3 b:3 c:2
            case 1. => a:3 b:1 c:2
            case 2. => a:1 b:3 c:2
            answer => 2 (you can delete 2 at least to make s good)

            aab
            already good => return 0

         */

         HashMap<Character, Integer> map = new HashMap<>();

         char[] chArr = s.toCharArray();

         // mapping map key = char / value = frequency
         for(int i = 0; i < chArr.length; i++) {
             map.put(chArr[i], map.getOrDefault(chArr[i], 0) + 1);
         }

        // there are no two different chars in s, HashSet
        HashSet<Integer> frequencies = new HashSet<>();
        
        int count = 0;
        // "bbcebab"

        // a:1 b:4 c:1 e:1 
        for(int frequency : map.values()) {
            while(frequencies.contains(frequency)) {
                count++;
                frequency--;
            }
            if(frequency > 0) frequencies.add(frequency);
        }
        
        return count;




    }
}