package MyWork.LeetCode;

public class ValidPalindrome {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(isPalindrome("race a car")); // Output: false
        System.out.println(isPalindrome(" ")); // Output: true
    }



    public  static boolean isPalindrome(String s){

        StringBuilder stringPalindrome=new StringBuilder();

        for (Character c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                stringPalindrome.append(Character.toLowerCase(c));
            }
        }
        String cleaned = stringPalindrome.toString();
        String reversed = stringPalindrome.reverse().toString();

        return cleaned.equals(reversed);


    }

}
