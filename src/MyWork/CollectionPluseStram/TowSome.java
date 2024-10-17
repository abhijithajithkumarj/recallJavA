package MyWork.CollectionPluseStram;

import java.util.*;
import java.util.stream.IntStream;

public class TowSome {

    public static void main(String[] args) throws IllegalAccessException {
        int[] arr = {2, 11, 7, 36, 85};
        System.out.println(Arrays.toString(towSome(arr, 9)));
    }


    public static int[] towSome(int[] num, int target) throws IllegalAccessException {
        Map<Integer, Integer> map =new HashMap<>();

        Optional<int[]> result= IntStream.range(0,num.length).boxed()
                .map(i->{
                    int com=target-num[i];
                    if (map.containsKey(com)){
                        return new int[]{
                                map.get(com),i
                        };
                    }else {
                        map.put(num[i],i);
                    }
                    return null;
                })
                .filter(Objects::nonNull)
                .findFirst();
        return result.orElseThrow(() -> new IllegalAccessException("No match found"));
    }



}
