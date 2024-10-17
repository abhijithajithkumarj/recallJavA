package MyWork.LeetCode;

public class PrefixSearchWord {
    public static void main(String[] args) {
        String data="my name is abhijith A testing for prefix";
        String serData="abhijith";
        System.out.println(checkPrefix(data,serData));

    }

    public static int checkPrefix(String sentence , String search){
        String[] sentences= sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences [i].startsWith(search))
                return i+1;

        }
        return -1;

    }




}
