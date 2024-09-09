package MyTest.mytestDsa;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={4,5,6,2};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr , int r, int c){

     if (r==0) return;

     if (r>c){
         if (arr[c] > arr[c+1]){
             int tem = arr[c];
             arr[c] = arr[c+1];
             arr[c+1]=tem;

         }
         bubbleSort(arr, r, c+1);
     }
     bubbleSort(arr,r-1,0);

    }

}
