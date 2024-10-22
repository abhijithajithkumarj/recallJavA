package MyWork.LeetCode;

import java.util.Arrays; // Importing the Arrays class for array manipulation
import java.util.stream.IntStream; // Importing IntStream for stream operations

public class ChocolatePurchase {

    public static void main(String[] args) {
        // Test cases to validate the findLeftoverMoney method
        System.out.println(findLeftoverMoney(new int[]{1, 2, 2}, 3)); // Expected Output: 0
        System.out.println(findLeftoverMoney(new int[]{3, 2, 3}, 3)); // Expected Output: 3
        System.out.println(findLeftoverMoney(new int[]{1, 4, 5, 2}, 6)); // Expected Output: 0
        System.out.println(findLeftoverMoney(new int[]{5, 5, 5}, 10)); // Expected Output: 0
        System.out.println(findLeftoverMoney(new int[]{10, 5, 1}, 5)); // Expected Output: 5
    }

    public static int findLeftoverMoney(int[] prices, int money) {
        // Step 1: Generate all possible pairs of prices using nested streams
        // Create a stream of indices from 0 to prices.length - 1
        int minSum = IntStream.range(0, prices.length) // Create a stream of indices
                .flatMap(i -> IntStream.range(i + 1, prices.length) // For each index i, create another stream for j (i + 1 to avoid duplicates)

                        // Example: If prices = [1, 2, 2], for i = 0:
                        // IntStream.range(i + 1, prices.length) generates: [1, 2]
                        // If i = 0, j can be 1 or 2 (avoiding duplicate pairs (0, 0))
                        // The flatMap creates a new stream for the sums of pairs (1, 2), (1, 2) again.
                        .map(j -> prices[i] + prices[j])) // Map the indices to the sum of prices[i] and prices[j]
                // Step 2: Filter out sums that exceed the available money
                .filter(sum -> sum <= money) // Keep only the sums that are less than or equal to the available money
                // Step 3: Find the minimum valid sum
                .reduce(Integer.MAX_VALUE, Math::min); // Find the minimum sum from the valid sums, default to Integer.MAX_VALUE

        // Step 4: Calculate the leftover money
        return (minSum == Integer.MAX_VALUE) ? money : money - minSum; // If no valid pairs found, return the initial money
    }

    public static int findLeftoverMoney2(int[] prices, int money) {
        int minSum = Integer.MAX_VALUE; // Initialize minSum to the largest possible value

        // Step 1: Generate all possible pairs of prices using nested loops
        for (int i = 0; i < prices.length; i++) { // Loop through the first chocolate
            for (int j = i + 1; j < prices.length; j++) { // Loop through the second chocolate
                int sum = prices[i] + prices[j]; // Calculate the sum of the two chocolate prices
                // Step 2: Check if the sum is less than or equal to the available money
                if (sum <= money) {
                    // Step 3: Update minSum if the current sum is less than minSum
                    if (sum < minSum) {
                        minSum = sum; // Found a new minimum sum
                    }
                }
            }
        }

        // Step 4: Calculate the leftover money
        return (minSum == Integer.MAX_VALUE) ? money : money - minSum; // If no valid pairs found, return the initial money
    }
}
