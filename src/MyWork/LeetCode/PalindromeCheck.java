package MyWork.LeetCode;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Test cases
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));      // Output: true
        System.out.println(validPalindrome("abc"));       // Output: false
        System.out.println(validPalindrome("racecar"));   // Output: true
        System.out.println(validPalindrome("deified"));   // Output: true
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {

                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}
