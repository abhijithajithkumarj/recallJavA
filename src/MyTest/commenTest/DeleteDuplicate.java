package MyTest.commenTest;

import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicate {



    public static Set<Integer> deleteDuplicate(int[] arr){
        Set<Integer> number=new HashSet<>();

        for (int i = 0; i < arr.length-1; i++) {
            number.add(arr[i]);
        }

        return number;
    }


    public static void main(String[] args) {
        int[] arr = {3, 45, 6, 7, 8, 8, 9, 90, 7};

        System.out.println(deleteDuplicate(arr));
    }
}
