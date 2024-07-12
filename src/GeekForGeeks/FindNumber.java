package GeekForGeeks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumber {

    public static  void findNumber(int n){
        List<Integer> numbers = Arrays.asList(5, 67, 89, 98, 78);


        boolean found = numbers.stream()
                .anyMatch(num -> num == n);


        if (found) {
            System.out.println("Number " + n + " found in the list.");
        } else {
            System.out.println("Number " + n + " not found in the list.");
        }


    }


    public static void main(String[] args) {

        int numberToFind = 67;
        findNumber(numberToFind);


    }
}
