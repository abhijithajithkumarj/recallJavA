package MyWork.LeetCode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringK {

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseStr("bacdefg", 2)); // Output: "bacdfeg"
        System.out.println(reverseStr("abcd", 2));    // Output: "bacd"
    }

    public  static String reverseStr(String s , int k){



        List<Character> reverse=s.substring(0,k)
                .chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.toList());
        Collections.reverse(reverse);

        System.out.println(reverse);

        StringBuilder reverseK=new StringBuilder();
        int count=0;
        int ind=0;


        for (char c:s.toCharArray()){
            count++;
            if (count<=k){
                reverseK.append(reverse.get(ind++));
            }
            else{
                reverseK.append(c);
            }
        }
        return reverseK.toString();
    }
}
