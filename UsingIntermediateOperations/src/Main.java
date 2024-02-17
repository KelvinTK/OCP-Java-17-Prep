import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    //Interediate operations
    /*
        - produces a stream as a result
        - can deal with infinite streams (by returning another infinite stream)
        - can be omitted in a pipeline (unlike source and terminal operations)
    */
    static  public void main( String[]args){

        //filtering
        Stream<String> names = Stream.of("Sam", "Tom", "Tim");
        names.filter(s-> s.startsWith("T")).forEach(System.out::println);
        System.out.println();

        //removing Duplicates
        Stream<String> names2 = Stream.of("Sam", "Tom", "Tim", "Tom");
        names2.distinct().forEach(System.out::println);
        System.out.println();

        //restricting by position
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1);//inf stream of numbers starting from 1
        nums.skip(3)//create a stream by skipping first 3 elements from the source stream
                .limit(4) // create a stream first 4 elements from the previous stream
                .forEach(System.out::println); //terminate the stream
        System.out.println();

        //mapping using map()
        Stream<String> names3 = Stream.of("Samuel", "Tom", "Tim");
        names3.map(s -> s.length()).forEach(System.out::println);
        //argument of map() is Function (equivalent: String::length)
        //creates one-one mapping from elements in source stream to new stream
        System.out.println();

        //mapping using flatMap()
        List<String> zero = List.of();
        List<String> one = List.of("Joe");
        List<String> two = List.of("Tim", "Tom");
        Stream<List<String>> names4 = Stream.of(zero, one, two);
        names4.flatMap(m -> m.stream()).forEach(System.out::println);
        System.out.println();

        //sorting
        Stream<String> names5 = Stream.of("Samuel", "Tom", "Tim", "Susan");
        names5.sorted().forEach(System.out::println); //sorted in alphabetical order
        System.out.println();

        //we can provide Comparator as an argument
        Stream<String> names6 = Stream.of("Samuel", "Joel", "Tim", "Susan");
        names6.sorted(Comparator.comparingInt(String::length)).forEach(System.out::println); //sort by length
        System.out.println();

        //peek()
        Stream<String> names7 = Stream.of("Samuel", "Joel", "Tim", "Susan");
        long count = names7.filter(s -> s.startsWith("T"))
                .count();
        System.out.println(count);
        //if we want to see what's going on in the pipeline:
        Stream<String> names8 = Stream.of("Samuel", "Joel", "Tim", "Susan");
        long count2 = names8.filter(s -> s.startsWith("S"))
                .peek(System.out::println) //argument of peek() is a consumer
                .count();






    }
}
