package MyWork.LeetCode;

import java.util.Collections; // Importing Collections for reversing the list
import java.util.List; // Importing List interface
import java.util.stream.Collectors; // Importing Collectors for stream operations

public class ReverseStringK {

    public static void main(String[] args) {
        // Test cases to validate the reverseStr method
        System.out.println(reverseStr("bacdefg", 2)); // Expected Output: "bacdfeg"
        System.out.println(reverseStr("abcd", 2));    // Expected Output: "bacd"
    }

    public static String reverseStr(String s, int k) {
        // Step 1: Extract the first k characters from the string s
        List<Character> reverse = s.substring(0, k) // Get a substring of the first k characters
                .chars() // Convert the substring to an IntStream of characters (Unicode values)
                .mapToObj(c -> (char) c) // Convert each int value to a Character object
                .collect(Collectors.toList()); // Collect the Characters into a List

        // Step 2: Reverse the list of characters
        Collections.reverse(reverse); // Reverse the order of characters in the list

        // Print the reversed list for debugging purposes
        System.out.println(reverse); // Display the reversed characters

        // Step 3: Initialize a StringBuilder to construct the final result
        StringBuilder reverseK = new StringBuilder(); // Create a StringBuilder to build the output string
        int count = 0; // Initialize a counter to track the number of processed characters
        int ind = 0; // Initialize an index to track the position in the reversed list

        // Step 4: Iterate over each character in the original string
        for (char c : s.toCharArray()) { // Convert the original string to a character array and iterate
            count++; // Increment the counter for each character processed
            if (count <= k) { // Check if the current count is within the first k characters
                reverseK.append(reverse.get(ind++)); // Append the next character from the reversed list
            } else { // If we've passed the first k characters
                reverseK.append(c); // Append the original character as is
            }
        }

        // Step 5: Return the final constructed string
        return reverseK.toString(); // Convert the StringBuilder to a String and return it
    }
}
