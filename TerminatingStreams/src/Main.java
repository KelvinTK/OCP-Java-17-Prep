import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static public void main(String[] args){

        //counting
        Stream<String> names = Stream.of("Jack", "Chris", "Joe");
        System.out.println(names.count()); //terminates the stream. count() on an infinite stream WON'T terminate
        System.out.println();

        //find min and max
        Stream<String> names2 = Stream.of("Jack", "Chris", "Joe");
        Optional<String> min = names2.min((s1, s2) -> s1.length()-s2.length()); //return is Optional
        min.ifPresent(System.out::println);

        //using with empty stream
        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());
        //these methods hang if applied to infinite streams
        System.out.println();

        //finding a value
        Stream<String> names3 = Stream.of("Jack", "Chris", "Joe");
        Stream<String> inf = Stream.generate(() -> "Luke");
        names3.findAny().ifPresent(System.out::println);
        inf.findAny().ifPresent(System.out::println); //terminates the stream
        System.out.println();

        //findFirst() always returns the first element
        Stream<String> names4 = Stream.of("Jack", "Chris", "Joe");
        names4.findFirst().ifPresent(System.out::println);
        System.out.println("-----------");

        //matching
        var myList = List.of("Jonathan", "Julia", "Joe", "5");
        Stream<String> inf2 = Stream.generate(() -> "Susan");
        Predicate<String> p = s -> Character.isLetter(s.charAt(0));//names beginning with the same letter
        System.out.println(myList.stream().anyMatch(p));
        System.out.println(myList.stream().allMatch(p));
        System.out.println(myList.stream().noneMatch(p));

        System.out.println(inf2.anyMatch(p));
        System.out.println();

        //iterating
        Stream<String> names5 = Stream.of("Andrew", "Peter", "John");
        names5.forEach(System.out::print); // the traditional for loop CAN'T be used here, it's NOT a data structure!!!
        System.out.println();
        System.out.println("------");

        //reducing
        //usually starts with an initial value and merge the next value:
        var myArray = new String[] {"L", "u", "k", "e"};
        var result = "";
        for (var s : myArray) result = result + s;
        System.out.println(result);
        //same thing
        Stream<String> myStream = Stream.of("L", "u", "k", "e");
        String theName = myStream.reduce("", (s, c) -> s + c);
        System.out.println(theName);
        System.out.println();
        //another way
        Stream<String> myStream2 = Stream.of("J", "o", "n", "a", "h");
        String theName2 = myStream2.reduce("", String::concat);
        System.out.println(theName2);

        Stream<Integer> stream = Stream.of(4, 8, 19);
        System.out.println(stream.reduce(1, (a, b) -> a*b)); //1*4*8*19
        System.out.println("--------");

        //if the identity is omitted, optional will be returned
        BinaryOperator<Integer> op = (a, b) -> a*b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(17);
        Stream<Integer> threeElements = Stream.of(5, 3, 18);
        empty.reduce(op).ifPresent(System.out::println); //no output
        oneElement.reduce(op).ifPresent(System.out::println);
        threeElements.reduce(op).ifPresent(System.out::println);
        System.out.println();

        //when dealing with different types
        Stream<String> names6 = Stream.of("Andrew", "Peter", "John");
        int len = names6.reduce(0, (i, s) -> i +s.length(), (a, b) -> a + b);
        System.out.println(len);
        System.out.println();

        //collecting (mutable reduction)
        Stream<String> myStream3 = Stream.of("J", "o", "n", "a", "h");
        StringBuilder theName3 = myStream3.collect(
                StringBuilder::new, //supplier - creates the object that will store the results as we collect data
                StringBuilder::append, //accumulator, passed as BiConsumer
                StringBuilder::append); // combiner, passed as BiConsumer
        //if this was a parallel stream, the order would be unpredictable
        System.out.println(theName3);
        System.out.println();

        //keeping the order in the collection (sorted)
        Stream<String> myStream4 = Stream.of("J", "o", "n", "a", "h");
        TreeSet<String> mySet = myStream4.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(mySet); //TreeSet automatically sorts the elements in ascending order
        System.out.println();

        //using Collectors class...important!!!
        Stream<String> myStream7 = Stream.of("J", "o", "n", "a", "t", "h", "a", "n");
        TreeSet<String> mySet2 = myStream7.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(mySet2);
        System.out.println();

        //if we don't care about the order
        Stream<String> myStream8 = Stream.of("J", "o", "n", "a", "t", "h", "a", "n");
        Set<String> mySet3 = myStream8.collect(Collectors.toSet()); //most likely a HashSet
        System.out.println(mySet3);


    }
}
