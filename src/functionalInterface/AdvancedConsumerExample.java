package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AdvancedConsumerExample {

    public static void main(String[] args) {

        Consumer<String> printIfNotEmpty=str->{
            if (!str.isEmpty()){
                System.out.println(str.toUpperCase());
            }
        };


        List<String> strings = Arrays.asList("Abhijith","Aravind","Sanu");


        strings.forEach(printIfNotEmpty);
    }
}
