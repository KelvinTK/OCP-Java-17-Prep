import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        //example: for a given list of names, get first two names which are four chars long, in an alphabetical order
        //old way:
        var names = List.of("John", "Kim", "Randy", "Paul", "Ramsey", "Ringo");
        List<String> filtered = new ArrayList<>();
        for (String name: names)
            if (name.length()==4) filtered.add(name);
        Collections.sort(filtered);
        var iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());
        System.out.println("--------");
        //same thing using stream
        names.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        System.out.println();

        //you can chain more pipelines together
        long count = Stream.of("John", "Kim", "Randy", "Paul", "Ramsey", "Ringo")//source
                .filter(s -> s.length() > 4)//intermediate operation
                .collect(Collectors.toList()) //terminal operation
                .stream() //source
                .count(); //terminal operation
        System.out.println(count);



    }
}
