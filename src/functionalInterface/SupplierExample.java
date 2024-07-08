package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<List<String>> stringSupplier = () -> Arrays.asList("", "hello", "world", "", "Java");

        List<String> strings = stringSupplier.get();
        System.out.println(strings);

    }



}
