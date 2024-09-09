package DataStructure.Recursion.QuikeSort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 52, 6, 78, 1, 23};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] num, int low, int hi) {
        if (low >= hi) return;

        int mid = low + (hi - low) / 2;
        int pivot = num[mid];
        int s = low;
        int e = hi;



        while (s <= e) {
            while (num[s] < pivot) s++;
            while (num[e] > pivot) e--;

            if (s <= e) {
                int temp = num[s];
                num[s++] = num[e];
                num[e--] = temp;
            }
        }

        quickSort(num, low, e);
        quickSort(num, s, hi);
    }
}
