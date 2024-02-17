import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Main {
    //How Stream Spliterator works
    /*
        - you start with some kind of collection with n elements
            - imagine a box containing number of toys
        - now you want to split this collection into two or more collections
            - imagine moving some toys from the original box to the new box
        - in order to do this, you have to create an object of type Spliterator
        - once you have Spliterator object, you can apply some common methods
    */
    public static void main(String[] args){
        //Example #1
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");
        Stream<String> stream = list.stream();
        Spliterator<String> originalSpliterator = stream.spliterator();
        Spliterator<String> newSpliterator = originalSpliterator.trySplit();

        newSpliterator.forEachRemaining(System.out::println);
        System.out.println("------");
        originalSpliterator.forEachRemaining(System.out::println);
        System.out.println();

        //Example #2
        List<String> list1 = Arrays.asList("one", "two", "three", "four", "five");
        Stream<String> stream1 = list1.stream();
        Spliterator<String> originalSpliterator1 = stream1.spliterator();
        Spliterator<String> newSpliterator1 = originalSpliterator1.trySplit();

        newSpliterator1.tryAdvance(System.out::println);//first element is processed
        System.out.println("------");
        newSpliterator1.forEachRemaining(System.out::println); //the remaining elements there then processed
        System.out.println("-------");
        originalSpliterator1.tryAdvance(System.out::println); //first element is processed
        System.out.println("---------");
        originalSpliterator1.forEachRemaining(System.out::println);//the remaining elements there then processed

    }
}
