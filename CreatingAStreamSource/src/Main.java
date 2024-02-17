import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[]args){
        //finite streams
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        //converting a collection to a Stream
        var list = java.util.List.of("a", "b", "c");
        Stream<String> fromList = list.stream();

        //parallel Stream
        Stream<String> fromListParallel = list.parallelStream();


        //Infinite Streams
        Stream<Double> rand = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2);

//        rand.forEach(System.out::println); //goes on non-stop

        //operations like limit() can turn an infinite Stream into a finite one
        //Ex. Create odd numbers less than 50
        Stream<Integer> oddNum50 = Stream.iterate(1, n -> n < 50,n -> n+2);
        oddNum50.forEach(System.out::println);
    }
}
