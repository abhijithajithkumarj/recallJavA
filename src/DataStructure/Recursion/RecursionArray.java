package DataStructure.Recursion;

public class RecursionArray {

    public static void main(String[] args) {
        int[] arr={1,96,3,4,5,6,7,8,9};
        System.out.println(findElement(arr,0,5));
    }


    static boolean sorted(int [] arr, int index){
        if (index== arr.length){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }


    static  int findElement(int[] arr,int index, int target){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }else {
            return   findElement(arr , index+1,target);
        }
    }



}
