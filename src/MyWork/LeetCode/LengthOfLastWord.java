package MyWork.LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "my name is abhi";
        System.out.println("Length of the last word: " + lengthOfLastWord(s));
    }


    public  static  int lengthOfLastWord(String s){
        String[] string=s.split(" ");
        return string[string.length-1].length();
    }
}
