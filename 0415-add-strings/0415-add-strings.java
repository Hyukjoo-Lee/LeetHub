class Solution {
    public String addStrings(String num1, String num2) {
        /**
          1
         456
          77
         int carry

         num1.charAt(i) +
         nums2.chatAt(i)

         10 <= sum
         carry = 1

         digit = sum % 10

         append(digit)


         */


         int length1 = num1.length() - 1;
         int length2 = num2.length() - 1;
         int carry = 0;
         StringBuilder sb = new StringBuilder();

         while(length1 >= 0 || length2 >= 0) {

            int digit1 = 0;
            int digit2 = 0;

             if(length1 >= 0) {
                digit1 = num1.charAt(length1) - '0';
                length1--;
             }

             if(length2 >= 0) {
                digit2 = num2.charAt(length2) - '0';
                length2--;
             }

             int sum = digit1 + digit2 + carry;

             if(sum >= 10) {
                 carry = 1;
             } else {
                 carry = 0;
             }

             sum = sum % 10;
             sb.append(sum);
         }

         if(carry == 1) {
            sb.append(1);
         }
         
         return sb.reverse().toString();
         










    }
}