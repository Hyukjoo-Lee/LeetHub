class Solution {
    public String longestCommonPrefix(String[] strs) {
        /**
            0 <= strs[i].length
            the element can be empty 

            "flower","flow","flight"
            "fl"
            fix strs[0].charAt[i]
            loop characters in other strs strs[j].charAt[0~length]
            append char if(strs[0].charAt[i] == strs strs[j].charAt[0~length])
            return empty string if there is no common prefix
         */
         if(strs[0].length() == 0) {
             return "";
         }
         

         StringBuilder sb = new StringBuilder();
         // "flower","flow","flight"
         for(int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i); // charAt(0) - f, charAt(1) - l, charAt(2) - o
            for(int j = 1; j < strs.length; j++) {
                // strs[1].charAt(0), strs[2].charAt(0)
                if(i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(ch);
         }
        
         return sb.toString();
























    }
}