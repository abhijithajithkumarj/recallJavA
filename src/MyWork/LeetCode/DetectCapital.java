package MyWork.LeetCode;

public class DetectCapital {
    public static void main(String[] args) {
        // Test cases
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode")); // Output: true
        System.out.println(detectCapitalUse("Google"));   // Output: true
        System.out.println(detectCapitalUse("FlaG"));     // Output: false
    }

    public static boolean detectCapitalUse(String word){

        boolean allUpperCase=word.chars().allMatch(Character::isUpperCase);

        boolean fistUpperCase=Character.isUpperCase(word.charAt(0))
                && word.substring(1).chars().allMatch(Character::isLowerCase);

        return allUpperCase || fistUpperCase;
    }
}
