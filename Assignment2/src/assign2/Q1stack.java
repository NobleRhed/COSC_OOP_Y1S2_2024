package assign2;

import java.util.Stack;


public class Q1stack {
    public boolean bracketCheck(String s) {
        Stack<Character> stack = new Stack<>();
        //loop the characters in a string
        //Ignore anything that isn't a bracket
        for (char bracket : s.toCharArray()) {
            //push characters that are opening brackets into stack
            if (bracket == '(' ||
                    bracket == '{' ||
                    bracket == '[') {
                stack.push(bracket);
            } //push closing brackets into stack
              // - check for match with the top
            else if (bracket == ')' ||
                    bracket == '}' ||
                    bracket == ']') {
                // If stack is empty, or top of the stack doesn't match
                // the closing bracket, return false
                if (stack.isEmpty()) return false;
                //if the corresponding bracket is found,
                //pop the top, and then check if the opening bracket
                //matches the current closing bracket
                char top = stack.pop();
               //If not matching, the string is invalid
                if ((bracket == ')' && top != '(') ||
                        (bracket == '}' && top != '{') ||
                        (bracket == ']' && top != '[')) {
                    return false;
                }
            }

        }
        //empty stack, all opening brackets were matched
        return stack.isEmpty();
    }
}
