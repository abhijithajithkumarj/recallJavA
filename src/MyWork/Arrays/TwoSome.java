package MyWork.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSome {

    public static int[] twoSome(int[] nums, int target){


        Map<Integer, Integer> isTwoSome = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            int data=target-nums[i];
            if (isTwoSome.containsKey(data)){
                return new int[] {isTwoSome.get(data),i};
            }
            isTwoSome.put(nums[i],i);


        }

        return new int[] {};

    }

    public static void main(String[] args) {
        // Test the twoSome method
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Get the result
        int[] result = twoSome(nums, target);

        // Print the output
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
