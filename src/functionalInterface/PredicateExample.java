package functionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class PredicateExample {


    public static void main(String[] args) {


        Predicate<Integer> isEven = number-> number % 2==0;

        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,7,8,55,86,89);
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);




        Predicate<String> isNotEmpty=str -> !str.isEmpty();

        List<String> strings=Arrays.asList("","","abhijith","neethu","abhijith","neethu");


        strings.stream()
                .filter(isNotEmpty)
                .forEach(System.out::println);


       




        Set<String> data= new  HashSet<>();
        Predicate<String> isDuplicate= data::add;

        strings.stream()
                .filter(isDuplicate)
                .forEach(System.out::println);




    }
}
