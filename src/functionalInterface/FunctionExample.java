package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String,Integer> stringLength= String::length;

        Function<String,String> stringIntoUpperCase=String::toUpperCase;


        List<String> strings = Arrays.asList("hello", "world", "java", "stream");

        strings.stream()
                .map(stringLength)
                .forEach(System.out::println);

        strings.stream()
                .map(stringIntoUpperCase)
                .forEach(System.out::println);




    }
}
