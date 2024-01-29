import java.util.*;

public class Main {
    //List
    /*
        - unlike arrays, lists can expand in size
        - they also can have duplicate elements
        there are two classes which implement List interface:
            - ArrayList - recommended when you read more than you write
            - LinkedList  - implements both List and Deque
    */
    public static void main(String[] args){

        //creation using factory methods --the size of the list is FIXED
        String[] names = {"Kelvin", "Joe", "Jane", "Maria", "Pete"};
//            1. Arrays.asList(varargs)

        List<String> nms = Arrays.asList(names);
        System.out.println(nms);
        names[0] = "Chris"; //changing the array changes the list
        System.out.println(nms); // - fixed-size list backed by an array
        System.out.println();

        //backing up works both ways
        nms.set(2, "Luka");
        System.out.println(nms);
        System.out.println(Arrays.toString(names)); //also changes
        System.out.println();

//            2. List.of(varargs)
        List<String> nams = List.of(names);
        System.out.println(nams);
        names[0] = "Tom"; //changing the array DOESN'T change the list
        System.out.println(nams); //- returns IMMUTABLE list
//        nams.set(0, "Emmy"); //wont work
//        System.out.println(nams);
        System.out.println();

//            3. List.copyOf(collection)
        List<String> nmes = List.copyOf(nms);
        System.out.println(nmes);
        names[0] = "Tim"; //changing the array DOESN'T change the list
        System.out.println(nmes); //- IMMUTABLE list with copy of original values
        System.out.println();


        //creation using constructors
        List<Double> nums1 = new ArrayList<>(); //new empty list
        List<Double> nums2 = new ArrayList<>(nums1); //makes a copy of nums1 and stores it in nums2
        List<Integer> nums3 = new ArrayList<>(10); //10 reserved elements but it's NOT fixed

        //List methods
        //add(element), add(index, element)
        nums3.add(23); nums3.add(2); nums3.add(5); nums3.add(67); nums3.add(46); nums3.add(98);
        nums1.add(24.0); nums1.add(87.0); nums1.add(27.7); nums1.add(72.0); nums1.add(1.1);
        System.out.println(nums1);
        System.out.println();

        //get(index)
        System.out.println(nums1.get(3));
        System.out.println();

        //remove(index), remove(element)
        nums1.remove(3);
        nums1.remove(72.0);
        System.out.println(nums1);
        nums3.remove(Integer.valueOf(67)); //convert to object
        System.out.println(nums3);
        System.out.println();

        //replaceAll(UnaryOperator<E> op)
        nums1.replaceAll(num -> num*2);
        System.out.println(nums1);
        System.out.println();

        //set(index, element) - replaces
        nums1.set(3, 9.0);
        System.out.println(nums1);
        System.out.println();

        //sort(Comparator<? super E> c)

        //converting List to array using toArray method
        //1. by creating an array of objects
        Object[] obArray = nums3.toArray(); //array of objects in the list

        //2
        Integer[] intArray = nums3.toArray(new Integer[0]);
        System.out.println("-----------");
        System.out.println(Arrays.toString(intArray));





    }
}
