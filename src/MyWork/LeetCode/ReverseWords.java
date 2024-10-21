package MyWork.LeetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s){

        return Arrays.stream(s.split(" "))
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

    }
}
