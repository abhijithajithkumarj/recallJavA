package GeekForGeeks;

import java.util.Arrays;

public class ArraySwapMultithreaded {

    public static void main(String[] args) {
        int [] arr={2,4,5,6,7,8,8,67,8};
        int n=arr.length;
        int k =3;
        int temp = arr[k - 1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

    }

}
