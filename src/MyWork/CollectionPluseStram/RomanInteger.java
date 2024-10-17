package MyWork.CollectionPluseStram;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RomanInteger {

    public static void main(String[] args) {
        System.out.println(romanInt("LVIII"));
    }

    public static int romanInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


         int result = IntStream.range(0,s.length()-1)
                 .map(i -> map.get(s.charAt(i)) >=

                         map.get(s.charAt(i + 1)) ?

                         map.get(s.charAt(i)) : -map.get(s.charAt(i)))
                 .sum();
        return  result += map.get(s.charAt(s.length() - 1));



    }
}
