package MyWork.LeetCode;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public  static  boolean isAnagram(String s, String t){

        return  Arrays.equals(s.chars().sorted().toArray(), t.chars().sorted().toArray());

    }
}
