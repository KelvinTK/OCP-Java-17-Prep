import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    //Primitive Streams
    /*
        - when working with primitive values, it's more convenient to use primitive streams
        - there are 3 types of primitive streams:
            - IntStream - used for int, short, byte and char
            - LongStream - used for long
            - DoubleStream - used for double and float
        - everything already discussed on streams apply to primitive streams as well
        - only difference is that primitive streams have some unique methods
    */
    //Summarizing statistics
    /*
        -summaryStatistics() method performs many calculations on the stream
            - getCount(): gives number of values (long)
            - getAverage(): returns average value (double) or ()  if the stream is empty
            - getSum(): returns a sum (double or long)
            - getMin(): returns smallest number (double, int, or long)
                - if the stream is empty, it returns the largest numeric value based on the type
            - getMax(): returns largest number (double, int, or long)
                - if the stream is empty, it returns the smallest numeric value based on the type

    */
    static public void main(String[] args){
        IntStream intStream = IntStream.of(45, 67, 23);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());
        System.out.println();

        DoubleStream doubleStream = DoubleStream.of(34.8, 67.0, 109.8);
        doubleStream.forEach(System.out::println);
        System.out.println();

        IntStream intStream1 = IntStream.range(2, 7);
        intStream1.forEach(System.out::println);
        System.out.println();

        IntStream intStream2 = IntStream.rangeClosed(2, 7);
        intStream2.forEach(System.out::println);
        System.out.println();

        //mapping streams
        //eg creating InStream from DoubleStream
        Stream<String> objStream = Stream.of("John", "Jim", "Paul", "Ryan");
        IntStream intStream3 = objStream.mapToInt(s -> s.length());
        intStream3.forEach(System.out::println);
        System.out.println();

        //can use flatMap() in the same way as before
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1, 3, 6));
        listOfLists.add(Arrays.asList(4, 2));
        listOfLists.add(Arrays.asList(9, 3, 60));
        System.out.println(listOfLists);

        IntStream intStream4 = listOfLists.stream()
                .flatMapToInt(list -> list.stream().mapToInt(n -> n));
        intStream4.forEach(System.out::print);
        System.out.println();
        System.out.println();

        //primitive streams use optionals
        var myIntStream = IntStream.rangeClosed(1, 5);
        OptionalDouble myAvg = myIntStream.average();
        myAvg.ifPresent(System.out::println);
        System.out.println(myAvg.getAsDouble()); //instead of get()
        System.out.println(myAvg.orElseGet(() -> Double.NaN));
        System.out.println();

        //Summarizing statistics
        var intStream6 = IntStream.of(-56, 26, 74, -37, 8, 199);
        IntSummaryStatistics stats = intStream6.summaryStatistics();
        System.out.println(stats.getCount());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());
        System.out.println(stats.getMin());
    }
}
