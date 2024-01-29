import java.util.function.*;

public class Main {
    //Predicate
   /*
   - is a predefined functional interface provided by java
   - import java.util to use it
   - has one abstract method, test(T) which takes an argument of type T and returns a boolean
   */
    public static void main(String[] args){
        Predicate<Integer> gt10 = n -> n>10;
        System.out.println(gt10.test(6));
        System.out.println(gt10.test(15));
        System.out.println();

        Predicate<String> has = (String s) -> s.contains("a");
        System.out.println(has.test("Kelvin"));

        //in methods
        System.out.println();
        myProbe(5, n -> n > 2);
        myProbe(5, n -> n % 2 ==0);

        //as a variable
        Predicate<Integer> myMethod = n->n*n +5 > 100;
        myProbe(5, myMethod);

    }

    //Predicates can be used in other methods
    static void  myProbe (int n, Predicate<Integer> predicate){
        if (predicate.test(n))
            System.out.println("Passed");
        else
            System.out.println("Failed");

    }
}
