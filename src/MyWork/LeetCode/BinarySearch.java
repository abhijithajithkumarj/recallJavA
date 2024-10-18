package MyWork.LeetCode;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr ={1,2,5,9,8,11,15,23,66};
        System.out.println(search(arr,8));
    }


    public  static  int search(int[] num, int target){
        int mid;
        int left=0;
        int right=num.length-1;

        while (left<=right){

            mid=left+(right+left)/2;

            if (num[mid]==target)
                return mid;

            else if  (target<num[mid])
                right=mid-1;


            else
                left =mid-1;
        }
        return left;
    }
}
