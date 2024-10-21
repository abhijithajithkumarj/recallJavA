package MyWork.LeetCode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);



        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);

    }

 public static void reverseString(char[] strings){

     List<Character> reversedList = IntStream.range(0, strings.length)
             .mapToObj(i -> strings[i])
             .collect(Collectors.toList());
     Collections.reverse(reversedList);

     System.out.println(reversedList);
 }

}
