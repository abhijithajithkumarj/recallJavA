package MyWork.LeetCode;

import java.util.List; // Importing List for array operations
import java.util.stream.Collectors; // Importing Collectors for stream operations
import java.util.stream.IntStream; // Importing IntStream for working with integer ranges

public class FindWordsContainingCharacter {

    public static void main(String[] args) {
        // Test cases to validate the findIndices method
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        System.out.println(findIndices(words1, x1)); // Expected Output: [0, 1]

        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        System.out.println(findIndices(words2, x2)); // Expected Output: [0, 2]

        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        System.out.println(findIndices(words3, x3)); // Expected Output: []
    }

    public static List<Integer> findIndices(String[] words, char x) {
        // Step 1: Create a stream of indices for the words array
        return IntStream.range(0, words.length) // Create an IntStream from 0 to the length of the words array
                // This means we generate a sequence of integers starting from 0 up to (but not including) words.length.
                // For example, if words has 4 elements, this will produce the stream of integers: 0, 1, 2, 3.

                .filter(i -> words[i].indexOf(x) != -1) // Step 2: Filter indices where the character x is found in the word
                // The indexOf(x) method checks if character x exists in words[i].
                // If x is found, it returns the index; otherwise, it returns -1.
                // We retain only the indices where x is found, i.e., indexOf(x) != -1.

                .boxed() // Convert the IntStream of primitive int values to a Stream<Integer> objects
                // This conversion is necessary because we need to collect the results into a List<Integer>.

                .collect(Collectors.toList()); // Collect the filtered indices into a List
        // This gathers all the Integer objects from the stream into a new List<Integer> to be returned.
    }
}
