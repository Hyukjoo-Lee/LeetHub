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

            
        
         */
         
         List<String> list = new ArrayList<>();

         for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if(i % 5 == 0) {
                list.add("Buzz");
            } else if(i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(Integer.toString(i));
            }
         }

         return list;
    }
}