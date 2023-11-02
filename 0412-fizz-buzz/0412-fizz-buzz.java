class Solution {
    public List<String> fizzBuzz(int n) {
        /**
        
            integer n
            return a string array answer

            if index is divisible by 3 and 5
            add FizzBuzz
            
            if index is divisible by 3
            add Fizz

            if index is divisible by 5
            add Buzz

            n = 7
            [1,2,Fizz,4,Buzz,Fizz,7..]

            
             String Concatenation
         */
         
         List<String> list = new ArrayList<>();

         for(int i = 1; i <= n; i++) {
             
            String str = "";

            if(i % 3 == 0) {
                str += "Fizz";
            }
            
            if(i % 5 == 0) {
                str += "Buzz";
            } 
            
            if(str.equals("")){
                str += Integer.toString(i);
            }

            list.add(str);
         }

         return list;
    }
}