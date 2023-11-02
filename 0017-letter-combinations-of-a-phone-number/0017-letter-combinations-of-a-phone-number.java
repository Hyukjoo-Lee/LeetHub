class Solution {
    public List<String> letterCombinations(String digits) {
        /**
        
            2-9
            return all possible letter combinations; any order
            backtracking
            2: [a,b,c]
            3: [d,e,f]
            4: [g,h,i]
            5: [j,k,l]
            6: [m,n,o]
            7: [p,q,r,s]
            8: [t,u,v]
            9: [w,x,y,z]

            how to make the basecase?
     
            37 / 39 => String length == 12
            23 => 9
            79 => 16

            map.getValues().length * map.getValues().length

            def pqrs
            dp,dq,dr,ds
            ep,eq,er,es
            fp,fq,fr,fs

            {2=abc, 3=def, 4=ghi, 5=jkl, 6=mno, 7=pqrs, 8=tuv, 9=wxyz}

         */

        Map<Character, String> map = mapDigits(digits);

        // System.out.println(map);
        List<String> combi = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(digits.equals("")) {
            return combi;
        }

        backtrack(digits, sb, 0, combi, map);
        return combi;
        
    }

    private Map<Character, String> mapDigits(String digits) {
        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        return map;
    }

    private void backtrack(String digits, StringBuilder sb, int idx, List<String> combi, Map<Character, String> map) {
        // basecase?
        if(idx == digits.length()) {
            combi.add(sb.toString()); // adg 
            return;
        }
        //  a b c
        //  
        char digit = digits.charAt(idx);
        String letters = map.get(digit);

        // System.out.println(letters);
        // 23
        // abc
        // def
        for(int i = 0; i < letters.length(); i++) {  
            sb.append(letters.charAt(i));
            backtrack(digits, sb, idx + 1, combi, map);
            sb.deleteCharAt(sb.length() -1);
        }

    }



}