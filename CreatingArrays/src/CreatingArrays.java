import java.util.Arrays;

public class CreatingArrays {
    public static void main(String[] args){
        //position of the square brackets doesn't matter except for the size
        //Declaring
        int[] nums0 = new int[3]; //without initialization
        nums0 = new int[] {4, 5, 6}; //initialization
//        nums0 = {7, 8, 9}; doesn't work.....check again

        //declaring and initializing at once
        int[] nums1 =  {1, 2, 3}; //with initialization
        int[] nums2 = new int[]{1, 2, 3};

        //
        int myNums[], myIntValues; //compiles with an array and an integer value,....not recommended

        //
        System.out.println(nums1.equals(nums2)); //doesn't compare content! Returns false
        System.out.println(nums1==nums2); //the same

        System.out.println(nums1); //doesn't print the values
        System.out.println(Arrays.toString(nums1)); //now prints the values
    }
}
