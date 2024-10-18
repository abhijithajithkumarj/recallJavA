package MyWork.CollectionPluseStram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class LengthOfLastWord {


    public static void main(String[] args) {

        String s="my name is abhijith";
        System.out.println(lengthOfLastWord(s));


    }


    public  static int lengthOfLastWord(String arr){

        String words[]=arr.split(" ");
        return Arrays.stream(words)
                .filter(word->!word.isEmpty())
                .reduce((first,second)-> second)
                .map(String::length)
                .orElse(0);



    }
}
