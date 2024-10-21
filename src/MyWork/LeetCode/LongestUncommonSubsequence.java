package MyWork.LeetCode;

public class LongestUncommonSubsequence {

    public static int findLUSLength(String a, String b){
        if (a.equals(b)){
            return -1;
        }

        return Math.max(a.length(),b.length());
    }
}
