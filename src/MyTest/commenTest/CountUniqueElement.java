package MyTest;

import multiThreading.lockFree.SharedResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountUniqueElement{


    public static int countUnique(){

        List<Integer> number= Arrays.asList(3,4,56,7,8,5,7,8,6,8);
        Set<Integer> uniqueNumber = new HashSet<>(number);
        return uniqueNumber.size();


    }


    public  static int count(int[] num){


        Arrays.sort(num);
        int uniqueCount = 1;


        for (int i = 1; i < num.length-1; i++) {
           if (num[i]!=num[i-1]){
               uniqueCount++;
           }
        }

        return uniqueCount;


    }

    public static void main(String[] args) {
        System.out.println(countUnique());
    }



}
