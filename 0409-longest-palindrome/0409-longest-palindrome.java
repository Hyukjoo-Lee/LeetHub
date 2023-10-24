class Solution {
    public int longestPalindrome(String s) {
        /**
            case sensitive
            
            a b cc ccdd
            abccccdd

            6+1?

            asdqwedsa

            map = ['a':1]   
         */
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int answer = 0;
        boolean hasOddCount = false;

        for (int count : map.values()) {
            if (count % 2 == 1) {
                // 7 => answer += 6
                answer += (count - 1);
                hasOddCount = true;
            } else {
                // add the even count of characters
                answer += count;
            }
        }
        
        if(hasOddCount) {
            return answer + 1;
        } else {
            return answer;
        }
    }
}