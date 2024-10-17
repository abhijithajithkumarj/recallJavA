package MyWork.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RomanToInteger {


    private static  final Map<Character,Integer> romanValues=new HashMap<>();

    static {
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }

    public int romanToInt(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> {
                    int currentValue = romanValues.get(s.charAt(i));
                    int nextValue = (i + 1 < s.length()) ? romanValues.get(s.charAt(i + 1)) : 0;
                    return (nextValue > currentValue) ? -currentValue : currentValue;
                })
                .reduce(0, Integer::sum);
    }


    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();

        System.out.println(converter.romanToInt("III"));    // Output: 3
        System.out.println(converter.romanToInt("IV"));     // Output: 4
        System.out.println(converter.romanToInt("IX"));     // Output: 9
        System.out.println(converter.romanToInt("LVIII"));  // Output: 58
        System.out.println(converter.romanToInt("MCMXCIV")); // Output: 1994
    }



}
