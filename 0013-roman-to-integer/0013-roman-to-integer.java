class Solution {
    public int romanToInt(String s) {
        /**
              Symbol       Value
                I             1
                V             5
                X             10
                L             50
                C             100
                D             500
                M             1000

                MCMXCIV
            s = III
            3
            map [I: 1]
            map [X: 5]
            MCM = 1900 
            I can be placed before V (5) and X (10) to make 4 and 9. 
            X can be placed before L (50) and C (100) to make 40 and 90. 
            C can be placed before D (500) and M (1000) to make 400 and 900.
         */

        Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        // i = 2
        // statement 
        int answer = 0;
        // XL
        for(int i = 0; i < s.length(); i++) {
            // I can be placed before V (5) and X (10) to make 4 and 9. 
            if(i+1 < s.length() && s.charAt(i) == 'I') {

                if(s.charAt(i+1) == 'V') {
                    answer += 4; // IV
                    i++;
                } else if (s.charAt(i+1) == 'X') {
                    answer += 9;
                    i++;
                } else {
                    answer += map.get(s.charAt(i));
                }

            } else if (i+1 < s.length() && s.charAt(i) == 'X') {

                if(s.charAt(i+1) == 'L') {
                    answer += 40; // IV
                    i++;
                } else if (s.charAt(i+1) == 'C') {
                    answer += 90;
                    i++;
                } else {
                    answer += map.get(s.charAt(i));
                }
            } else if (i+1 < s.length() && s.charAt(i) == 'C') {

                if(s.charAt(i+1) == 'D') {
                    answer += 400; // IV
                    i++;
                } else if (s.charAt(i+1) == 'M') {
                    answer += 900;
                    i++;
                } else {
                    answer += map.get(s.charAt(i));
                }
            } else {
                answer += map.get(s.charAt(i));
            }
        }
        
        return answer;
        // int length = s.length();
        // int answer = 0;

        // for(int i = 0; i < s.length() - 1; i++) {
        //     if(map.get(s.charAt(i+1)) > map.get(s.charAt(i))) {
        //         answer -= s.charAt(i);
        //     } else {
        //         answer += map.get(s.charAt(i)); 
        //     }

        // }

        // return answer;

    }
}