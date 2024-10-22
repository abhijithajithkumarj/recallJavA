package MyWork.Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nus) {
        // Create a TreeSet to remove duplicates and sort the elements
        Set<Integer> removeDuplicatesData = new TreeSet<>();

        // Add each element from the array to the TreeSet
        for (int n : nus) {
            removeDuplicatesData.add(n);
        }

        // Return the size of the TreeSet, which represents the number of unique elements
        return removeDuplicatesData.size();
    }

    public  static  int removeDuplicateInStream(int[] nums){
        Set<Integer> removeDuplicatesData = new TreeSet<>();
        return (int) Arrays.stream(nums)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        // Test the removeDuplicates method
        int[] nums = {4, 5, 2, 2, 3, 4, 1, 5};

        // Get the result
        int uniqueCount = removeDuplicates(nums);
        int uniqueCount2 = removeDuplicateInStream(nums);

        // Print the output
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.println("Number of unique elements: " + uniqueCount2);
    }
}
