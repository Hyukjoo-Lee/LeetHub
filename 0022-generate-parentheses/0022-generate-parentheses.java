class Solution {
    public List<String> generateParenthesis(int n) {
        /**
            n = 2
            (()) , ()(), ...
            
            backtracking

            ) 

            basecase = n * 2
            n pairs 
                                            (
                                        ((    ()
                                   (((          )))
                                ((((              ))))
                                ...
                            length 

            length == n * 2


         */
         List<String> answer = new ArrayList<>();
         int opening = 0;
         int closing = 0;

         backtrack("", n, opening, closing, answer);
         return answer;

    }

    private void backtrack(String str, int n, int open, int close, List<String> answer) {
        if(str.length() == n * 2) {
            answer.add(str);
            return;
        }
        
        if(open < n) {
            backtrack(str + "(", n, open + 1, close, answer);
        }

        if(close < n && close < open) {
            backtrack(str + ")", n, open, close + 1, answer);
        }

    } 

    
}