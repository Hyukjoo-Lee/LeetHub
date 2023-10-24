class Solution {
    public List<String> fizzBuzz(int n) {
        /**
            n
            return string array (1-indexed)

            answer[i] = "FizzBuzz" if i is divisible by 3 && 5
                      = "Fizz"     if i is divisible by 3
                      = "Buzz"     if i is divisible by 5
                      = (as string) remaining conditions


           answer[3] = 1,2,"Fizz"

           return a string array? 

           But return type is List<String>
           
         */
         
         List<String> answer = new ArrayList<>();
         
         for(int i = 1; i <= n; i++) {
             if(i % 3 == 0 && i % 5 ==0) {
                 answer.add("FizzBuzz");
             } else if (i % 3 == 0) {
                 answer.add("Fizz");
             } else if (i % 5 == 0) {
                 answer.add("Buzz");
             } else {
                 answer.add(Integer.toString(i));
             }
         }

         return answer;
    }
}