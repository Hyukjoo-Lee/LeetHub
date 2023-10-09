class Solution {
    public boolean isAnagram(String s, String t) {
        /**
            HashMap (count char)
            anagram
            [a:3, n:1, g:1, m:1 ,r:1]
            nagaram
         */
         if(s.length() != t.length()) return false;

         Map<Character, Integer> map = new HashMap<>();
        
         for(int i = 0; i < s.length(); i++) {
           char current = s.charAt(i);
           map.put(current, map.getOrDefault(current, 0) + 1);
         }
         // [a:0, n:0, g:0, m:0, r:0]
         // nagaram
         for(int i = 0; i < t.length(); i++) {
           char current = t.charAt(i);
           map.put(current, map.getOrDefault(current, 0) - 1);
         }
         
         for(Map.Entry<Character,Integer> entry : map.entrySet()) {
           Integer value = entry.getValue();
           if(value != 0) return false;
         }
         
         return true;









    }
}