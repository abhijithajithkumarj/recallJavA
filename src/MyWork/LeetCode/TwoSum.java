package MyWork.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) throws IllegalAccessException {
        int[] arr={2,11,7,36,85};
        System.out.println(Arrays.toString(towSome(arr, 9)));
    }

    public static   int[] towSome(int[] num , int target) throws IllegalAccessException {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <num.length; i++) {
            int complement=target-num[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }else {
                map.put(num[i],i);
            }

        }
        throw new IllegalAccessException("no match");
    }
}
