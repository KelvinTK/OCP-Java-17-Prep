import java.util.function.*;

public class Main {
    public static void main(String[] args){
        //CONSUMER
        //.andThen()
        Consumer<String> greet1 = s -> System.out.println("Hello "+ s + "!");
        Consumer<String> greet2 = s -> System.out.println("Bye "+ s + "!");
        greet1.andThen(greet2).accept("Steve");
        //or
        Consumer<String> grtCombined = greet1.andThen(greet2);
        grtCombined.accept("Kelvin");
        System.out.println();

        //FUNCTION
        Function<Integer, Integer> triple = n -> 3 * n;
        Function<Integer, Integer> sq = n -> n * n;
        //.andThen()
        System.out.println(triple.andThen(sq).apply(5));
        //.compose()
        System.out.println(triple.compose(sq).apply(7));
        System.out.println();

        //PREDICATE
        Predicate<Integer> gt10 = n -> n>10;
        Predicate<Integer> lt100 = n -> n<10;
        //.and()
        Predicate<Integer> p1 = gt10.and(lt100);
        //.or()
        Predicate<Integer> p2 = gt10.or(lt100);
        //.negate()
        Predicate<Integer> p3 = gt10.negate(); //compliments

        System.out.println(p1.test(67) +" " + p2.test(42) +" " + p3.test(2));







    }
}
