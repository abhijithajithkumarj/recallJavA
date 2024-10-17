package streameApi.internidiatOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {


    public static void main(String[] args) {
        List<Integer> data=Arrays.asList(1,52,6,2,21,2,5,2,5,2);
        List<Integer> result=data

                .stream()
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .distinct()
                .limit(10)
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
