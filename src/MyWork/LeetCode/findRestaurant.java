package MyWork.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class findRestaurant {
    public static void main(String[] args) {
        // Example test cases
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        System.out.println(findRestaurant(list1, list2)); // Output: ["Shogun"]

        String[] list3 = {"happy", "sad", "good"};
        String[] list4 = {"sad", "happy", "good"};
        System.out.println(findRestaurant(list3, list4)); // Output: ["sad", "happy"]
    }

    public static List<String> findRestaurant(String[] list1, String[] list2){

        Map<String,Integer> indexMap=new HashMap<>();
        for (int i = 0; i < list1.length;i++) {
            indexMap.put(list1[i],i);
        }

        Map<Integer, List<String>> groupedData = Arrays.stream(list2)
                .filter(indexMap::containsKey)
                .collect(Collectors.groupingBy(
                        str -> indexMap.get(str) + Arrays.asList(list2).indexOf(str),
                        Collectors.toList()
                ));


        System.out.println("Grouped Data (Index Sum -> List of Strings): " + groupedData);


        return groupedData.entrySet().stream()


                .min(Comparator.comparingInt(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .orElse(Collections.emptyList());

        
        
        

    }
}
