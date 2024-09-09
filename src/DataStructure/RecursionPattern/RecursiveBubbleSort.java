package DataStructure.RecursionPattern;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        String[] arr = {"pear", "apple", "orange", "banana"};


        bubbleSort(arr, arr.length - 1, 0);


        for (String s : arr) {
            System.out.print(s + " ");
        }
    }


    static void bubbleSort(String[] arr, int r, int c) {
        if (r <= 0) return;

        if (c >= r) {
            bubbleSort(arr, r - 1, 0);
        } else {
            if (arr[c].compareTo(arr[c + 1]) > 0) {
                String temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
             }

            bubbleSort(arr, r, c + 1);
        }
    }
}
