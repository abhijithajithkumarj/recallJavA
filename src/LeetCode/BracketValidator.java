import java.util.*;
import java.util.stream.IntStream;

public class BracketValidator {
    public static boolean isValid(String s) {
        Map<Character, Character> bracketPairs = Map.of(')', '(', '}', '{', ']', '[');
        Deque<Character> stack = new ArrayDeque<>();

        return s.chars().mapToObj(c -> (char) c).allMatch(ch -> {
            if (bracketPairs.containsKey(ch)) {
                return !stack.isEmpty() && stack.pop().equals(bracketPairs.get(ch));
            } else {
                stack.push(ch);
                return true;
            }
        }) && stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]")); // true
        System.out.println(isValid("([)]"));   // false
        System.out.println(isValid("({[]})")); // true
    }
}
