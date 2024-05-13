271. Encode and Decode Strings

프리미엄 문제여서 이 전에 풀었던 기록을 참고하였습니다.


문제는 문자열 리스트를 인코딩하여 하나의 문자열로 변환하고, 
이를 디코딩하여 다시 원래의 문자열 리스트로 변환하는 알고리즘을 설계하는 것입니다.

```java
/**
 * Design an algorithm to encode a list of strings to a string.
 * The encoded string is then sent over the network and is decoded back to the original list of strings.
 */

public class Codec {
    final char SEPARATOR = ";";

    // e.g. 
    // ["Hello" , "World"]
    // => ";Hello5;World"
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length());
            sb.append(SEPARATOR);
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        return Arrays.asList(s.split(SEPARATOR));
    }
}



public class Codec {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    
    final char SEPARATOR = ";";

    public String encode(List<String> strs) {
        return String.join(separator, strs);
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        return Arrays.asList(str.split(separator));
    }
}
```
