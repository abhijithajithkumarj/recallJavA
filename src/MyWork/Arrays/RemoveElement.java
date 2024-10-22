package MyWork.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {


    public static int removeElement(int[] num, int target){

        ArrayList<Integer> integersForRemovingGiveTarget=new ArrayList<>();

        for (int n: num){
            if (n!=target){
                System.out.println(n);
                integersForRemovingGiveTarget.add(n);
            }
        }

        return integersForRemovingGiveTarget.size();

    }
    public static int removeElementWithStream(int[] num, int target){

        return (int) Arrays.stream(num)
                .filter(n->n!=target)
                .count();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,3};
        System.out.println(removeElement(nums,3));
        System.out.println(removeElementWithStream(nums,3));

    }
}