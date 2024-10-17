package MyWork.LeetCode;

import java.util.Arrays;

public class LargeDigits {

    public static void main(String[] args) {

        int[] digit={1,2,9};
        System.out.println(Arrays.toString(setTheLargeDigit(digit)));

    }


    public static int[] setTheLargeDigit(int[] arr){


        int n=arr.length;
        for (int i = n-1; i>=0  ; i--) {

            if (arr[i]<9){
                arr[i]++;
                return arr;
            }

            arr[i]=0;
        }

        int[] newNumber=new int[n+1];
        newNumber[0]=1;


        return newNumber;

    }
}
