package LeetCode;
import java.util.stream.IntStream;


public class Pillow {
    public int passThePillow(int n, int time) {
        return IntStream.of(time).
                map(t -> (t / (n - 1) % 2 == 0) ? (t % (n - 1) + 1)
                        : (n - t % (n - 1))).findFirst().orElse(1);
    }

    public static void main(String[] args) {
        Pillow solution = new Pillow();
        System.out.println(solution.passThePillow(5, 8));  // Output: 1
        System.out.println(solution.passThePillow(5, 7));  // Output: 2
    }
}


