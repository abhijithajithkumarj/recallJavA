package MyWork.LeetCode;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MaximumStrongPairXOR {

    public static void main(String[] args) {
        // Test cases to validate the maxStrongPairXOR method
        System.out.println(maxStrongPairXOR(new int[]{1, 2, 3, 4, 5})); // Expected Output: 7
        System.out.println(maxStrongPairXOR(new int[]{10, 100})); // Expected Output: 0
        System.out.println(maxStrongPairXOR(new int[]{5, 6, 25, 30})); // Expected Output: 7
    }

    public static int maxStrongPairXOR(int[] nums) {
        // Step 1: Create a stream of all possible pairs (including the same number)
        return IntStream.range(0, nums.length) // Generate a stream of indices from 0 to nums.length - 1
                .boxed() // Convert the IntStream to a Stream<Integer> for further operations
                .flatMap(i -> IntStream.range(0, nums.length) // For each index 'i', generate another stream of indices from 0 to nums.length - 1
                        // For example, if nums has 3 elements: [1, 2, 3], this will produce:
                        // For i = 0: 0, 1, 2 (producing pairs (1,1), (1,2), (1,3))
                        // For i = 1: 0, 1, 2 (producing pairs (2,1), (2,2), (2,3))
                        // For i = 2: 0, 1, 2 (producing pairs (3,1), (3,2), (3,3))
                        .mapToObj(j -> new int[]{nums[i], nums[j]})) // Create a new array for each pair (nums[i], nums[j])
                // This means we end up with a stream of pairs such as:
                // [(1,1), (1,2), (1,3), (2,1), (2,2), (2,3), (3,1), (3,2), (3,3)]

                // Step 2: Filter pairs that are strong pairs
                .filter(pair -> Math.abs(pair[0] - pair[1]) <= Math.min(pair[0], pair[1])) // Check strong pair condition
                // The condition checks if the absolute difference between the two numbers in the pair is
                // less than or equal to the smaller of the two.
                // For example: For pair (1, 2), |1 - 2| = 1, min(1, 2) = 1, so it's a strong pair.
                // For pair (1, 3), |1 - 3| = 2, min(1, 3) = 1, so it's NOT a strong pair.

                // Step 3: Calculate the XOR for each strong pair
                .mapToInt(pair -> pair[0] ^ pair[1]) // Compute the XOR of the pair
                // This line computes the bitwise XOR for each strong pair.
                // For example:
                // For pair (1, 1), the XOR is 1 ^ 1 = 0
                // For pair (1, 2), the XOR is 1 ^ 2 = 3
                // For pair (2, 2), the XOR is 2 ^ 2 = 0
                // For pair (2, 3), the XOR is 2 ^ 3 = 1
                // And so on...

                // Step 4: Find the maximum XOR value
                .max() // Get the maximum XOR value from the computed XOR values
                // This retrieves the maximum value from the stream of XOR results.
                // If there are strong pairs, it gives the largest XOR value calculated.
                // If no strong pairs are found, it returns an empty Optional.

                .orElse(0); // If no pairs found, return 0
        // This provides a default value of 0 in case no strong pairs exist.
        // It ensures the function returns a valid integer even when there are no pairs.
    }
}