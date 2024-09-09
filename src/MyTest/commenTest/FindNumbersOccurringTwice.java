package MyTest;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumbersOccurringTwice {


    public  static void findNumbersOccurringTwice(int[] arr){

        Map<Integer ,Integer> frequencyMap=new HashMap<>();
        List<Integer> result = new ArrayList<>();


        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(result);


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5};
         findNumbersOccurringTwice(arr);


    }

}
