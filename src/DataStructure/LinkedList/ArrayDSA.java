package DataStructure.LinkedList;

import java.util.Arrays;

public class ArrayDSA {


    int[] myArray;

    public void testing(int[] a,int givenData){
        myArray=new int[5];

        int i =0;

        for (int data: a ){
        if (data !=givenData){
            myArray[i] = data;
            i++;
        }
        }

        Arrays.stream(myArray).forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayDSA obj=new ArrayDSA();
        int[] exampleInput = {0, 1, 85, 3, 4};

        obj.testing(exampleInput,5);
    }

}
