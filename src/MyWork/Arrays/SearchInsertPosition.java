package MyWork.Arrays;

public class SearchInsertPosition {

    public static  int searchInsert(int[] num, int target){
        int left=0;
        int right=num.length-1;
        while (left<right){
            int mid=left +(right-left)/2;

            if (num[mid]==target){
                return mid;
            } else if (num[mid]<target) {
                left=mid+1;

            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int[] nums1 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums1, 5)); // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums2, 3)); // Output: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums3, 6)); // Output: 4
    }
}
