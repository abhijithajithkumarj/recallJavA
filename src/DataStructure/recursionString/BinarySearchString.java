package DataStructure.recursionString;

import java.util.Arrays;

public class BinarySearchString {


    public static void main(String[] args) {
        String[] arr = {"abhijith", "neethu", "aravind" ,"abhimanu","banu"};
        String target = "neethu";


        Arrays.sort(arr);

        int result = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println(result);
    }

    static int binarySearch(String[] arr, String target, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        int comparison = arr[mid].compareTo(target);

        return comparison == 0
                ? mid
                : (comparison > 0
                ? binarySearch(arr, target, low, mid - 1)
                : binarySearch(arr, target, mid + 1, high));

    }


}
