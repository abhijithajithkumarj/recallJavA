package MyWork.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {

    public static List<Integer> mergeArray(int[] num1, int[] num2){
        List<Integer> sortData=new ArrayList<>();

        for (int n: num1){
            if (n!=0){
                sortData.add(n);
            }
        }

        for (int n: num2){
            sortData.add(n);
        }

        Collections.sort(sortData);
        return sortData;


    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        System.out.println(mergeArray(num1,num2));
    }
}
