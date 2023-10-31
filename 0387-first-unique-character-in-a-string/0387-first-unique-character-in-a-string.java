class Solution {
    public int firstUniqChar(String s) {
        /**
            find unique character in s

            map
            s = "leetcode"
            [e: 3, l: 1, t:1, c: 1, ...]
            the first one


            
        
         */

         Map<Character, Integer> map = new HashMap<>();
         
         char[] chArr = s.toCharArray();

         for(char ch : chArr) {
             map.put(ch, map.getOrDefault(ch, 0) + 1);
         }

         for(int i = 0; i < s.length(); i++) {
             if(map.get(s.charAt(i)) == 1) return i;
         }

         return -1;
    }
}