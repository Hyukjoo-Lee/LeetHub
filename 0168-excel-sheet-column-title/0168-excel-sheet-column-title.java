class Solution {
    public String convertToTitle(int columnNumber) {
        /**
            1 => A
            2 => B
            3 => C
            4 => D
            5 => E
            6 => F
            7 => G
            ...
            26 => Z **
            27 => AA
            28 => AB

            convert int into char
            char ch = (int) columnNumber   

            memo:
            char ch = (char)(columnNumber % 26 + 'A'); // B -> 'A' + 1
         */

        // 1 + A => B?
        // 1 => A
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            char ch = (char)('A' + (columnNumber - 1) % 26); // 'A' + 0 => A
            System.out.println(ch);
            sb.insert(0, ch);
            // if 27
            // 26 / 26 = 1
            columnNumber--;
            columnNumber = columnNumber / 26;
        }
        // System.out.println(ch);

        return sb.toString();  
         
    }
}