package MyWork.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Step 1: Create a map to store the next greater element for each number in nums2
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        // Stack to help find the next greater element in nums2
        Deque<Integer> stack = new ArrayDeque<>();

        // Step 2: Traverse nums2 in reverse order to find the next greater element
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            // Maintain elements in the stack such that the top of the stack is always greater than the current element
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop(); // Remove elements that are not greater
            }
            // If the stack is empty, there is no greater element to the right, otherwise the top is the next greater
            nextGreaterMap.put(current, stack.isEmpty() ? -1 : stack.peek());
            // Push the current element onto the stack
            stack.push(current);
        }

        // Step 3: Use Stream API to map each element of nums1 to its next greater element
        return Arrays.stream(nums1)
                .map(num -> nextGreaterMap.getOrDefault(num, -1)) // Map each number to its corresponding next greater element
                .toArray(); // Convert the Stream to an array
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        // Get the next greater elements for nums1 based on nums2
        int[] result = nextGreaterElement(nums1, nums2);

        // Print the result
        System.out.println("Output: " + Arrays.toString(result));
    }
}
