public class FlowControl3 {
    public static void main(String[] args) {
        //do while is the same
        //compared to while, do while is executed at least once
        int m = 0;
        do {
            System.out.println("hello");
            m++;
        } while (m < 5);

        //more than one index can be used for a for loop, separated by a comma
        for(int i = 0, j= 1; (i+j) < 5; i++, j++){
            System.out.println("works");
        }

        int[] nums = {1, 2, 3, 4};
        for(int num: nums){
            System.out.println(num);
        }
    }
}
