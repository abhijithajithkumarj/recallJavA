package MyWork.LeetCode;

public class LongestCommonPrefix {

    public static String longestPrefix(String[] str) {

//        if (str == null || str.length == 0) {
//            return "";
//        }
//
//
//        for (int i = 0; i < str[0].length(); i++) {
//            char ch = str[0].charAt(i);
//
//
//
//            for (int j = 1; j < str.length; j++) {
//                if (str[j].charAt(i) != ch) {
//
//                    return str[0].substring(0, i);
//                }
//            }
//        }

        if (str==null|| str.length==0)
            return " ";

        for (int i = 0; i < str.length; i++) {
            char ch=str[0].charAt(i);

            for (int j = 1; j <str.length; j++) {
                if (str[j].charAt(i)!=ch){
                    return str[0].substring(0,i);
                }

            }

        }


        return str[0];
    }

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestPrefix(strings));
    }
}
