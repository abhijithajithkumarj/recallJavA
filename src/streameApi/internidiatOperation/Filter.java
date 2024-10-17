package streameApi.internidiatOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {


    public static void main(String[] args) {


        List<Integer> number= Arrays.asList(2,5,6,8,2,698,52,53,6,252);
        List<Integer> result=number.stream()
                .filter(n->n>5)
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(result);



    }

}
