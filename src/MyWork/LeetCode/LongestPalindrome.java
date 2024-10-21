package MyWork.LeetCode;

import java.util.stream.Collectors;

public class LongestPalindrome {
    // Method to find the length of the longest palindrome that can be built with the given string
    public static int longestPalindrome(String s) {
        // Step 1: Calculate the total length of paired characters
        int length = s.chars() // Create an IntStream from the string's characters
                .mapToObj(c -> (char) c) // Convert each int Unicode value to a character
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Group characters and count occurrences
                // Example: if the input string is "abccccdd", the process works as follows:
                // 1. Each character from the string is processed.
                // 2. The groupingBy function creates a map where the key is the character,
                //    and the value is the number of occurrences of that character.
                // For the input "abccccdd", the resulting map will be:
                // {'a' -> 1, 'b' -> 1, 'c' -> 4, 'd' -> 2}

                .values().stream() // Get a stream of counts from the map values
                // For the above example, this stream would contain: [1, 1, 4, 2]
                .mapToInt(Long::intValue) // Convert each Long count to an int
                // Converting the counts results in the stream: [1, 1, 4, 2]
                .reduce(0, (sum, count) -> sum + (count / 2 * 2));
        // Calculate the total length of pairs
        // The logic here takes each count, divides by 2 to get the number of pairs, and multiplies by 2.
        // For our example:
        // - For 'a': 1/2 * 2 = 0 (no pairs)
        // - For 'b': 1/2 * 2 = 0 (no pairs)
        // - For 'c': 4/2 * 2 = 4 (two pairs)
        // - For 'd': 2/2 * 2 = 2 (one pair)
        // The total length will be: 0 + 0 + 4 + 2 = 6

        // Step 2: Check if there's any character with an odd count
        // This step is crucial because we can place one odd character in the center of a palindrome.
        // Step 2: Check if there's any character with an odd count
// This step is crucial because we can place one odd character in the center of a palindrome.
        return length + (s.chars() // Create a stream of characters from the string 's' to check for odd occurrences
                .anyMatch(c -> s.chars() // For each character 'c' in the stream of characters
                        .filter(ch -> ch == c) // We check each character 'ch' in 's' to see if it is the same as 'c'
                        // 'ch' represents each character in the original string 's'.
                        // 'c' is the character we're checking now.
                        // The expression 'ch == c' checks if the character 'ch' is equal to the character 'c'.
                        // So, if we have 's' = "aabb", and we're checking 'c' = 'a':
                        // For 'a', 'ch' will be 'a' (match) and then 'a' again (match).
                        // When 'ch' is 'b', it won't match 'c' (skip it).
                        .count() // Count how many times 'c' appears in the string 's'.
                        // So, if 'c' is 'a', this counts how many 'a's are in 's'.
                        // For example, if 's' is "aabb":
                        // - 'a' appears 2 times,
                        // - 'b' appears 2 times.
                        // This count will help us know if 'c' appears an odd or even number of times.
                        % 2 != 0) ? 1 : 0); // If the count is odd, we add 1 to the total length.

                       // Explanation of the return statement:
                       // - The variable `length` holds the total length of paired characters we found earlier.
                      // - We add 1 to `length` if there's at least one character that appears an odd number of times.
                        // - This is because we can use one of these odd characters in the center of our palindrome.
                     // - For example, if the original length of paired characters is 6 (like in "aabbcc"),
                        //   and we find 'd' appears once (odd), we can add it to make the palindrome longer.
                    // - So, the final length becomes 6 (paired characters) + 1 (for the odd character) = 7.


        // This part means:
        // If 'c' appears an odd number of times (like 1, 3, 5, etc.), we can add one of these 'c's in the middle of our palindrome.
        // So, we check:
        // - If 'a' appears 2 times (even), we don't add anything.
        // - If 'b' appears 1 time (odd), we add 1.
        // We check all characters this way and see if we can add one extra character for our palindrome.


        // For our example with the input string "abccccdd":
        // The counts from the first part would be:
        // - 'a': 1 occurrence (odd)
        // - 'b': 1 occurrence (odd)
        // - 'c': 4 occurrences (even)
        // - 'd': 2 occurrences (even)

        // Now, while checking for odd occurrences:
        // - For 'a': count = 1 (odd) -> will contribute +1 to the palindrome length
        // - For 'b': count = 1 (odd) -> will contribute +1 to the palindrome length
        // - For 'c': count = 4 (even) -> contributes nothing as it's fully paired
        // - For 'd': count = 2 (even) -> contributes nothing as it's fully paired

        // Since we have at least one character with an odd count (either 'a' or 'b'),
        // we can add one more character to the palindrome, which results in:
        // Total length = paired length (6) + 1 (for one odd character) = 7
    }

    // Main method to test the longestPalindrome function
    public static void main(String[] args) {
        // Test cases to validate the implementation
        String test1 = "abccccdd"; // Expected Output: 7
        System.out.println("Length of longest palindrome: " + longestPalindrome(test1));

        // Additional test cases to further validate the implementation
        String test2 = "a"; // Single character, expected output: 1
        System.out.println("Length of longest palindrome: " + longestPalindrome(test2));

        String test3 = "abc"; // No repeating characters, expected output: 1
        System.out.println("Length of longest palindrome: " + longestPalindrome(test3));

        String test4 = "aabbcc"; // All characters repeat twice, expected output: 6
        System.out.println("Length of longest palindrome: " + longestPalindrome(test4));

        String test5 = "aaaabbbb"; // Characters repeat with odd and even counts, expected output: 8
        System.out.println("Length of longest palindrome: " + longestPalindrome(test5));

        String test6 = "xyz"; // No pairs, expected output: 1
        System.out.println("Length of longest palindrome: " + longestPalindrome(test6));

        String test7 = ""; // Empty string, expected output: 0
        System.out.println("Length of longest palindrome: " + longestPalindrome(test7));

        String test8 = "cc"; // Two same characters, expected output: 2
        System.out.println("Length of longest palindrome: " + longestPalindrome(test8));
    }
}
