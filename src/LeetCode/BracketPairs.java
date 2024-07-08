package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketPairs {

    public boolean isValid(String s){
        Map<Character,Character> bracketPairs=new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');

        Stack<Character> stack =new Stack<>();

        for (char ch : s.toCharArray()) {
            if (bracketPairs.containsKey(ch)) {

                if (stack.isEmpty() || stack.pop() != bracketPairs.get(ch)) {
                    return false;
                }

            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        BracketPairs solution = new BracketPairs();

        System.out.println(solution.isValid("("));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
    }
}
