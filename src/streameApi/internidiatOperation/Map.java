package streameApi.internidiatOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(2,5,6,8,2,698,52,53,6,252);
        List<String> words=Arrays.asList("abhijith","neethu","sabithu");


        List<Integer> result=number.stream()
                .map(n->n +=1000)
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> finalResult=words
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(finalResult);

    }
}
