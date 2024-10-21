package MyWork.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseVowels {

    public static void main(String[] args) {
        // Test cases
        System.out.println(reversVowels("IceCreAm")); // Output: "AceCreIm"
        System.out.println(reversVowels("leetcode"));  // Output: "leotcede"
    }



    public  static String reversVowels(String s){
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));


        List<Character> vowelList=
                s.chars()
                        .mapToObj(c-> (char)c)
                        .filter(vowels::contains)
                        .collect(Collectors.toList());
        Collections.reverse(vowelList);

        StringBuilder result= new StringBuilder();

        int indexVowel=0;


        for (char c:s.toCharArray()){
            if (vowels.contains(c))
                result.append(vowelList.get(indexVowel++));
            else
                result.append(c);

        }

        return result.toString();

    }
}
