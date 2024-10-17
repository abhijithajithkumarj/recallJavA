package streameApi.internidiatOperation;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<List<String>> listOflist= Arrays.asList(
                Arrays.asList("one", "two"),
                Arrays.asList("abhi","sabu")
        );

        List<?> listData=listOflist.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        System.out.println(listData);


            int[][] numbers = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9} };


            int[] flattenedArray = Arrays.stream(numbers)
                    .flatMapToInt(Arrays::stream)
                    .toArray();

            // Print the flattened array
            System.out.println("Flattened array: " + Arrays.toString(flattenedArray));


    }


}
