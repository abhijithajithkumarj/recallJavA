package MyTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

    public static void dataTesting(List<String> str){
        List<String> list= str.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        System.out.println(list);
    }


    public static void main(String[] args) {
        List<String> strings= Arrays.asList("abhijith","nithin");
        dataTesting(strings);

    }


}
