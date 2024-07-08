package LeetCode;

public class Palindrome {


    public boolean isPalindrome(Integer x){
        String data=x.toString();
        String reversed = new StringBuilder(data).reverse().toString();
        return data.equals(reversed);
    }


    public static void main(String[] args) {
        Palindrome palindromeChecker=new Palindrome();
        System.out.println(palindromeChecker.isPalindrome(121));
        System.out.println(palindromeChecker.isPalindrome(-121));
        System.out.println(palindromeChecker.isPalindrome(10));
        System.out.println(palindromeChecker.isPalindrome(12321));

    }
}
