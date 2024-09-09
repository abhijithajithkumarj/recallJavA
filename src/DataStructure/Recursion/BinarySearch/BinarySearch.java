package DataStructure.Recursion.BinarySearch;


public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int result = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println(result != -1 ? "Element found at index: " + result : "Element not found in the array.");
    }

    static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target) return mid;

        return arr[mid] > target
                ? binarySearch(arr, target, low, mid - 1)
                : binarySearch(arr, target, mid + 1, high);
    }
}
