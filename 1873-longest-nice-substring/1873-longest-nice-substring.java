class Solution {
    public String longestNiceSubstring(String s) {
    /**
        - string s is nice if
        s contains every alphabet both in uppercase and lowercase
        YazaAay
           i
             j
        [Y,a,z,A,y]
        2. return the longest substring of s that is nice
        
        index ?
        substring(i,j)?

     */
       String longest = "";

       for(int i = 0; i < s.length() - 1; i++) {
           for(int j = i + 1; j <= s.length(); j++) {
             String sub = s.substring(i,j);
            //  System.out.println(sub);
             if(isNice(sub)) {
                 System.out.println(sub);
                 if(longest.length() < sub.length()) longest = sub;
             }
           }
        }

        return longest;       
    }

    private boolean isNice(String s) {
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c) && !set.contains(Character.toLowerCase(c))) {
                return false;
            }

            if(Character.isLowerCase(c) && !set.contains(Character.toUpperCase(c))) {
                return false;
            }
        }

        return true;
    }
}