import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        /**
            Open brackets , close brackets 으로만 이루어진 단어가 

            주어진 3개의 조건에 만족하는지 판단하는 문제입니다.

            Stack 의 push 와 pop 의 속성 FILO 을 이용해서 문제를 해결합니다.

            시간 복잡도는 문자열의 모든 문자를 한번씩 연산하기 때문에

            O(N) 입니다.

            여기서 주의 해야 할 점은

            스택이 비어 있지 않은 상태에서 peek() 또는 pop()을 호출하기 전에 

            isEmpty()를 사용하여 스택이 비어 있는지 확인해야 합니다.

         */
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; 
                }
            }
        }

        return stack.isEmpty();
    }
}
