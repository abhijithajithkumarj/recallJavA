public class RecursiveBubbleSort {
    public static void main(String[] args) {
        String[] arr = {"pear", "apple", "orange", "banana"};

        // Call the bubbleSort function with the array and its length
        bubbleSort(arr, arr.length - 1, 0);

        // Print the sorted array
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    // Combined Recursive Bubble Sort function
    static void bubbleSort(String[] arr, int r, int c) {
        // Base case: if no more rows to sort, sorting is complete
        if (r <= 0) return;

        // If the pass for the current row is complete, move to the next row
        if (c >= r) {
            // Recursively call bubbleSort for the next pass
            bubbleSort(arr, r - 1, 0);
        } else {
            // Swap elements if they are out of order
            if (arr[c].compareTo(arr[c + 1]) > 0) {
                String temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            // Recursive call to continue the current pass
            bubbleSort(arr, r, c + 1);
        }
    }
}
