class Solution {
    public boolean isValid(String s) {
        /**
            1. stack - LIFO
            "()[]{}"
            push (
            if ")", stack.pop();
            push [
            if "]", stack.pop();
            push {
            if "}", stack.pop();

            return stack.isEmpty();
         */

        char[] chArr = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();

        for(Character ch : chArr) {
            // ( [ {
            if(ch == '(' || ch == '{' || ch== '[') {
                stack.push(ch);                
            } else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();

    }







}