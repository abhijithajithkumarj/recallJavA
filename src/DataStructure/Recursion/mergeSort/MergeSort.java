package DataStructure.Recursion.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 52, 6, 78, 1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }




    static  int[] mergeSort(int []arr){
        if (arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] merge=new int[first.length+second.length];
        int i = 0, j = 0, k = 0;


        while (i<first.length&& j< second.length){
            merge[k++] = (first[i] < second[j]) ? first[i++] : second[j++];
        }

        while (i<first.length) merge[k++] = first[i++];

        while (j<second.length) merge[k++] = second[j++];


        return merge;

    }

}
