import java.util.function.*;
import java.time.*;

public class Main {
    //java.util.function package
    //usually reffered to as functional programming
    public static void main(String[] args){
        //Supplier: T get()
        Supplier<LocalDateTime> ldt = () -> LocalDateTime.now();
        System.out.println(ldt.get()); //uses the get() method
        System.out.println();

        //Consumer
        Consumer<String> greet = s -> System.out.println("Hello " + s + "!");
        greet.accept("kelvin");
        System.out.println();

        //BiConsumer
        BiConsumer<String, Integer> biCons = (name, age) -> System.out.println(name + " is " +age + " years old");
        biCons.accept("Kelvin", 27);
        System.out.println();

        //Predicate
        Predicate<String> name = s -> s.contains("e");
        System.out.println(name.test("Kelvin"));
        System.out.println();

        //BiPredicate
        BiPredicate<Integer, Integer> compare = (a, b) -> a > b;
        System.out.println(compare.test(23, 67));
        System.out.println();

        //Function
        Function<Integer, Double> square = n ->(double) n*n;
        System.out.println(square.apply(56));
        System.out.println();

        //BiFunction
        BiFunction<String, Integer, String> concat = (s, i) -> s + i;
        System.out.println(concat.apply("MSB", 001));
        System.out.println();

        //UnaryOperator
        UnaryOperator<Integer> neg = n -> -n;
        System.out.println(neg.apply(6));
        System.out.println();

        UnaryOperator<String> shout = String::toUpperCase; //method refs can also be used
        System.out.println(shout.apply("Good morning!"));
        System.out.println();

        //BinaryOperator
        BinaryOperator<Double> diff = (n, m) -> n-m;
        System.out.println(diff.apply(356.7, 78.0));
        System.out.println();

        BinaryOperator<String> concate = (s, q) -> s + q;
        System.out.println(concate.apply("Kelvin ", "Johns"));



    }
}
