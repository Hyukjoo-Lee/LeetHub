class Solution {
    public int findContentChildren(int[] g, int[] s) {
        /**
            at most one cookie
            each child i has greed factor g[i] 
            = the minimum size of a cookie that the child will be content with

            each cookie j has size s[j]

            - if(s[j] >= g[i]) => plus 1
            we can assign cookie 'j' to the child 'i'
            and child i will be content

            maximize the number of your content children 
            and output the maximum number

            greed = [1,2,3]
            size of cookie = [1,1]

            only able to content child i(0) >= g[0] with 1 greed factor
            output is 1

            g = [7,8,9,10]
            s = [5,6,0,0]
                          i
                 j
            
            i fix and find the number of cookies in s
            move j++ until we find the number of cookies in s
            if the number is found, store 0 to s[j] and maximum++
            and i++
            when i >= g.length, return maximum

            but we need to consider the both lengths
            i > g.length
            j > s.length

 
         */
         int maximumContent = 0;
         // 0 <= s.length <= 3 * 104
         // 1 <= g.length <= 3 * 104
         // 1 <= g[i], s[j] <= 231 - 1
         int lengthG = g.length;
         int lengthS = s.length;

         if(s.length == 0) return 0;
         
         Arrays.sort(g);
         Arrays.sort(s);

         int i = 0;
         int j = 0;

         while(i < g.length && j < s.length) {
             if(g[i] <= s[j]) {
                 maximumContent++;
                 i++;
                 j++;
             } else {
                 j++;
             }
         }

         return maximumContent;
    }
}