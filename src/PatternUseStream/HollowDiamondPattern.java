package PatternUseStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Size of the diamond
        printHollowDiamond(n);
    }

    public static void printHollowDiamond(int n) {

        Stream.concat(
                IntStream.range(0, n).mapToObj(i -> createDiamondRow(n, i)),
                // Generate the lower half of the diamond
                IntStream.range(0, n - 1).mapToObj(i -> createDiamondRow(n, n - 2 - i))
        ).forEach(System.out::println);
    }

    private static String createDiamondRow(int n, int i) {
        // Create spaces before the star
        String spaces = " ".repeat(n - i - 1);
        // Create the stars for the row
        String stars;
        if (i == 0) {
            stars = "*"; // Top and bottom rows have a single star
        } else {
            stars = "*" + " ".repeat(2 * i - 1) + "*"; // Hollow part in the middle
        }
        // Combine spaces and stars
        return spaces + stars;
    }
}
