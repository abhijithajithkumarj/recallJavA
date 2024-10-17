package streameApi.terminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> data=Arrays.asList(1,52,6,2,21,2,5,2,5,2);
        List<String> word= Arrays.asList("apple","banana","cherry","bananacakey");

        word.forEach(System.out::println);

        Optional<?> result=data.stream()
                .reduce(Integer::sum);
        System.out.println(result);

        Boolean data2=data.stream().allMatch(n->n==0);
        System.out.println(data2);


        Boolean data3=data.stream().anyMatch(n->n==2);
        System.out.println(data3);

        Boolean data4=data.stream().noneMatch(n->n==0);
        System.out.println(data4);

        Optional<?> stringData=word.stream()
                .filter(words->words.startsWith("b"))
                .findAny() ;

        System.out.println(stringData);




    }

}
