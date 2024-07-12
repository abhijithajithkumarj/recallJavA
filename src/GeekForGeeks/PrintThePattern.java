package GeekForGeeks;

public class PrintThePattern {

    public static void printPattern(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                result.append(String.valueOf(j).repeat(i));
            }

        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }
}
