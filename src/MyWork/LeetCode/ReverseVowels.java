package MyWork.LeetCode;

import java.util.*; // Importing necessary classes from java.util package
import java.util.stream.Collectors; // Importing Collectors for stream operations

public class ReverseVowels {

    public static void main(String[] args) {
        // Test cases to validate the reversVowels method
        System.out.println(reversVowels("IceCreAm")); // Expected Output: "AceCreIm"
        System.out.println(reversVowels("leetcode"));  // Expected Output: "leotcede"
    }

    public static String reversVowels(String s) {
        // Step 1: Define a set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        // This set contains both lowercase and uppercase vowels to handle all cases.

        // Step 2: Extract the vowels from the input string
        List<Character> vowelList =
                s.chars() // Create a stream of the characters in the string 's'
                        .mapToObj(c -> (char) c) // Convert each int Unicode value to a Character object
                        .filter(vowels::contains) // Filter the stream to keep only characters that are vowels
                        // The 'contains' method checks if the vowel set contains the character.
                        // For example, if 'c' is 'a', 'contains(c)' returns true; otherwise, it returns false.
                        .collect(Collectors.toList()); // Collect the filtered vowels into a List

        // Step 3: Reverse the list of vowels
        Collections.reverse(vowelList); // Reverse the order of vowels in the list to prepare for replacement

        // Step 4: Prepare to build the result string
        StringBuilder result = new StringBuilder(); // StringBuilder to efficiently construct the output string
        int indexVowel = 0; // Index to track the current position in the reversed vowel list

        // Step 5: Iterate over the original string's characters
        for (char c : s.toCharArray()) { // Convert the string into a character array and iterate
            // toCharArray() method returns an array containing the characters of the string.
            // For example, "hello" becomes ['h', 'e', 'l', 'l', 'o'].
            if (vowels.contains(c)) // Check if the current character is a vowel
                // If it is a vowel, append the next vowel from the reversed list.
                result.append(vowelList.get(indexVowel++)); // Use 'indexVowel' to get the next vowel from 'vowelList'
            else
                // If it's not a vowel, append the original character to the result.
                result.append(c); // Append the original character to the result string
        }

        // Step 6: Return the final result as a string
        return result.toString(); // Convert StringBuilder to String and return
    }
}
