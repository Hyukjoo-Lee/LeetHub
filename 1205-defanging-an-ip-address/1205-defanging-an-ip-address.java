class Solution {
    public String defangIPaddr(String address) {
        /**
            replace every period with [.]
            1. simply utilizing replace function address.replace(".", "[.]")

            2. find . and replace [.] (sb or concatenation)

         */
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            if(current == '.') {
                sb.append("[.]");
            } else {
                sb.append(current);
            }
        }

        return sb.toString();









    }
}