package streameApi.colletors;

import java.util.Arrays;
import java.util.List;

public class Collectors {

    public static void main(String[] args) {
        List<String> word= Arrays.asList("apple","banana","cherry","bananacakey");

        String result=word.stream()
                .collect(java.util.stream.Collectors.joining(","));

        System.out.println(result);
    }

}
