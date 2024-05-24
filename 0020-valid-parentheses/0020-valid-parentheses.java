class Solution {
    public boolean isValid(String s) {
        /**
            open brackets 과 close brackets 로만 이루어진 단어가 주어지고

            문제에 주어진 3가지 조건에 만족하는지 판단하는 문제입니다.

            1.Open brackets must be closed by the same type of brackets.
              열린 괄호는 같은 타입의 닫힌 괄호에 의해 닫혀야 한다.
            2.Open brackets must be closed in the correct order.
              열린 괄호는 올바른 순서에 의해 닫혀야 한다.
            3.Every close bracket has a corresponding open bracket of the same type.
              모든 닫힌 괄호는 같은 타입의 열린 괄호를 가진다.

            예를 들어 ()[]{} 같은 경우
            세가지 조건에 모두 만족하기 때문에 true 를 반환합니다.

            Stack 의 push 와 pop 의 속성 First In Last Out (FILO) 을 활용하여 문제를 해결 할 수 있습니다.
            
            ()[]{} 

            ([{ 같이 먼저 열린 괄호를 stack 에 push 를 하고

            다음 char 이 같은 유형의 닫힌 괄호가 나오는지 확인 .. 나오면 pop 으로 제거합니다.

            이 과정을 계속 반복하게 되면 결국 stack에 push 되었던 괄호가 모두 없어질 것입니다.

            여기서 주의 할 점은 stack 이 비어 있지 않은 상태에서 peek() or pop() 을 호출 해야 함이고

            이를 isEmpty() 를 사용하여 선체크 해야합니다.

            time complexity 는 O(N) 입니다 - n - the length of string
            space complexity 도 O(N) 입니다 - n - the length of string
            
        */

         Stack<Character> stack = new Stack<>();

         char[] chArr = s.toCharArray();

         for(char ch : chArr) {
            if(ch == '{' || ch == '[' || ch== '(') {
                stack.push(ch);
            } else if(!stack.isEmpty() && stack.peek() == '{' && ch == '}') {
                stack.pop();
            } else if(!stack.isEmpty() && stack.peek() == '[' && ch == ']') {
                stack.pop();
            // 다른 조건이 있을까? - s consists of parentheses only '()[]{}' => 없음
            } else if(!stack.isEmpty() && stack.peek() == '(' && ch == ')'){
                stack.pop();
            } else {
                return false;
            }
         }

         return stack.isEmpty();



    }
}