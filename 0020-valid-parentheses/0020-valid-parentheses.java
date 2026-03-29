class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            // opening
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                // empty stack
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}