import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //Collecting results from the stream
    /*
        - in addition to the already discussed collect() terminal operation, there are some other pre-defined collectors
            - there are static methods on the collector class
    */
    public static void main(String[] args){
        //joining()
        var names = Stream.of("Sam", "Pete", "Tim");
        String result = names.collect(Collectors.joining("-"));
        System.out.println(result);
        System.out.println();

        //averaging()
        var names2 = Stream.of("Sam", "Pete", "Tim");
        Double result2 = names2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2);
        System.out.println();

        //toCollection()
        var names3 = Stream.of("Sam", "Pete", "Tim", "Tom");
        TreeSet<String> result3 = names3
                .filter(s -> s.startsWith("T"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3);
        System.out.println();

        //toMap()
        var names4 = Stream.of("Sam", "Pete", "Tim", "Tom");
        Map<String, Integer> result4 = names4
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(result4);
        System.out.println();
//        var names04 = Stream.of("Sam", "Pete", "Tim", "Tom");
//        Map<Integer, String> result04 = names04
//                .collect(Collectors.toMap(String::length, k -> k)); // duplicate keys
//        System.out.println(result04);

        //to solve this problem, a merge rule should be provided
        var names04 = Stream.of("Sam", "Pete", "Tim", "Tom");
        Map<Integer, String> result04 = names04
                .collect(Collectors.toMap(
                        String::length,
                        k -> k,
                        (s1, s2) -> s1+ "; " + s2
                )); // duplicate keys
        System.out.println(result04);
        System.out.println(result04.getClass());

        //if the class is not specified, toMap() can return any class
        //which implements Map interface - usually HashMap, but not guaranteed
        //....or specify the class
        var names004 = Stream.of("Sam", "Pete", "Tim", "Tom");
        Map<Integer, String> result004 = names004
                .collect(Collectors.toMap(
                        String::length,
                        k -> k,
                        (s1, s2) -> s1+ "; " + s2,
                        TreeMap::new //specifying the class
                )); // duplicate keys
        System.out.println(result004);
        System.out.println(result004.getClass());
        System.out.println();

        //groupingBy()
        var names5 = Stream.of("Sam", "Pete", "Tim", "Thomas");
        Map<Integer, List<String>> result5 = names5
                .collect(Collectors.groupingBy(String::length));
        System.out.println(result5);

        var names05 = Stream.of("Sam", "Pete", "Tim", "Thomas");
        Map<Integer, Set<String>> result05 = names05
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toSet())); //downstream collector ensures that the result will be a set
        System.out.println(result05);

        var names005 = Stream.of("Sam", "Pete", "Tim", "Thomas");
        TreeMap<Integer, Set<String>> result005 = names005
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new, //map supplier ensures that the Map implementation will be a TreeMap
                        Collectors.toSet())); //downstream collector ensures that the result will be a set
        System.out.println(result005);
        System.out.println();

        //partitioningBy() - has only 2 groups: true and false
        var names6 = Stream.of("Sam", "Pete", "Tim", "Thomas");
        Map<Boolean, List<String>> result6  = names6 //key is always Boolean
                .collect(Collectors.partitioningBy(s -> s.length() <= 4));
        System.out.println(result6);

        var names06 = Stream.of("Sam", "Pete", "Tim", "Thomas");
        Map<Boolean, Set<String>> result06  = names06 //key is always Boolean
                .collect(Collectors.partitioningBy(
                        s -> s.length() <= 4,
                        Collectors.toSet()
                ));
        System.out.println(result06);
        System.out.println();

        //teeing() is used for returning multiple values, eg. sum and average
        //step 1: create a type which stores values
        record MyData(int sum, double avg){}
        //step 2: use stream to return the result of the type MyData
        var nums = Stream.of(3, 4, 6, 8, 10);
        MyData result7 = nums.collect(
                Collectors.teeing(
                        Collectors.summingInt(i -> i),
                        Collectors.averagingDouble(i -> i),
                        MyData::new
                ));
        System.out.println("Avg: " + result7.avg() + ", Sum: " + result7.sum());
    }
}
