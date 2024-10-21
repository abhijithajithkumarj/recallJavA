package MyWork.LeetCode;

public class AttendanceAward {
    public static void main(String[] args) {
        // Test cases to validate the checkRecord method
        System.out.println(checkRecord("PPALLP")); // Output: true (valid attendance record)
        System.out.println(checkRecord("PPALLL")); // Output: false (invalid attendance record)
    }

    public static boolean checkRecord(String s) {
        // Step 1: Count the number of 'A's in the string
        long absent = s.chars() // Create an IntStream from the characters of the string
                .filter(c -> c == 'A') // Filter to keep only 'A' characters
                .count(); // Count the number of 'A's

        // Step 2: Check if the string contains three consecutive 'L's
        boolean late = s.contains("LLL"); // Check for the presence of "LLL" in the string

        // Step 3: Determine if the attendance record is valid
        // The record is valid if:
        // - The number of 'A's is less than 2 (i.e., no more than 1 absence)
        // - There are no three consecutive 'L's (i.e., not more than 2 late marks in a row)
        return absent < 2 && !late; // Return true if both conditions are satisfied; otherwise, return false
    }
}
