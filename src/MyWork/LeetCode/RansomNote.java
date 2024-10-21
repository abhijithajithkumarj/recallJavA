package MyWork.LeetCode;
import java.util.stream.Collectors;

public class RansomNote {
    // Method to determine if the ransom note can be constructed from the characters in the magazine
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Step 1: Convert the magazine string into a list of characters
        var magazineList = magazine
                .chars() // Create an IntStream from the magazine's characters
                .mapToObj(c -> (char) c) // Convert each int Unicode value to a character
                .collect(Collectors.toList()); // Collect characters into a List

        // Step 2: Check if all characters in the ransom note can be removed from the magazineList
        // The allMatch method checks if all characters from the ransom note exist in the magazineList.
        return ransomNote.chars() // Create an IntStream from the ransom note's characters
                .mapToObj(c -> (char) c) // Convert each int Unicode value to a character
                .allMatch(magazineList::remove); // Try to remove each character from magazineList

        // Explanation of magazineList::remove:
        // - This method reference (magazineList::remove) attempts to remove each character from the magazineList.
        // - If a character from the ransom note exists in the magazineList, it is removed.
        // - If all characters from the ransom note are successfully removed (i.e., exist in magazineList),
        //   allMatch returns true; otherwise, it returns false.

        // For example, if ransomNote is "aa" and magazine is "aab":
        // - The first 'a' from ransomNote is removed from magazineList (now it has one 'a' and one 'b' left).
        // - The second 'a' from ransomNote is also removed (now it has one 'b' left).
        // - Since all characters from ransomNote have been matched and removed, it returns true.

    }

    public static void main(String[] args) {
        // Test cases to validate the implementation
        System.out.println(canConstruct("a", "b"));        // Output: false (not enough 'a's)
        System.out.println(canConstruct("aa", "ab"));      // Output: false (not enough 'a's)
        System.out.println(canConstruct("aa", "aab"));     // Output: true (enough 'a's available)
    }
}
