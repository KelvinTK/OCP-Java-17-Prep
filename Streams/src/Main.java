import java.util.Optional;

public class Main {
    //Optional
    /*
        - optional is a container object that is used to contain values
        - think of it as a box, which can either be empty or can contain smth
            - but the Optional object itself is never null
        - there are some methods to deal with optional values without explicit null checks
            - otherwise, we could get NullPointerException if not handled properly
        - we have to import java.util.Optional
    */
    public static void main(String[] args){
        System.out.println(average(19, 35, 56));
        System.out.println(average());
        System.out.println();

        //check if optional is empty
        Optional<Double> myOptional = average(45, 67, 68);
        if (myOptional.isPresent())
            System.out.println(myOptional.get()); //get the value but must check if NOT empty first

        //good practice is to use empty() when value is null
        System.out.println("---------");
        Optional myOptional2 = (average(7, 10) == null)? Optional.empty(): Optional.of(average(7, 10));
        System.out.println(myOptional2.get());
        System.out.println("---------");
        System.out.println();

        //factory method
        Optional myNullableOptional = Optional.ofNullable(average(56, 2, 4));
        System.out.println(myNullableOptional.get());
        System.out.println();

//        run method if optional is not empty
        myOptional.ifPresent(System.out::println);
        System.out.println();

        //orElse()
        Optional<Double> myOptional3 = average();
        System.out.println(myOptional3.orElse(Double.NaN));
        System.out.println();

        //orElseGet()
        System.out.println(myOptional3.orElseGet(()-> Math.random())); //supplier must return a double

        System.out.println("------");
        System.out.println(myOptional3.orElseThrow());

        System.out.println("---------");
        System.out.println(myOptional3.orElseThrow(()-> new IllegalStateException()));
    }

    //example: calculate the average value of numbers in an array wc might be empty
    public static Optional<Double> average (int... myNumbers){
        if (myNumbers.length == 0)
            return Optional.empty();
        double sum = 0;
        for (int num : myNumbers)
            sum += num;

        return  Optional.of((double)sum/myNumbers.length);
    }
}
