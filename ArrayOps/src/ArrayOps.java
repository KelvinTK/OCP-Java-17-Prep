import java.util.Arrays;

public class ArrayOps {
    static public void main(String[] args){
        //Sorting, searching, and comparing
        //arrays are mutable
        int[] nums = {8, 4, 6};
        Arrays.sort(nums); //changes the original array
        System.out.println(Arrays.toString(nums));

        //Binary search - works on a sorted array only
        System.out.println(Arrays.binarySearch(nums, 6)); //returns index
        System.out.println(Arrays.binarySearch(nums, 10)); //this would be in the third place in the array

        //Comparing
        /*
        - if one array has fewer number of elements then it is smaller*
        - if both arrays have the same number of elements then the smaller one is the one whose first diff number is smaller
        .null is smaller than any other values

        FOR Strings
        - one is smaller if it's a prefix of another
        - numbers are smaller than letters
        - uppercase is smaller than lowercase
        - alphabetical order is applied
        */

        int nums2 [] = {5, 8, 10};
        int nums3 [] = {1, 10, 5, 4};
        System.out.println();
        System.out.println(Arrays.compare(nums, nums2));//returns negative: nums < nums2
        System.out.println(Arrays.compare(nums2, nums3)); //returns positive: nums2 > nums3

        System.out.println(Arrays.mismatch(nums2, nums3));//-1 if they are equal, otherwise the first index where they differ


    }
}
