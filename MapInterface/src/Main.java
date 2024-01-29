import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    //Implementations of Map interface:
    /*
        - HashMap
            - order doesn't matter
            - same read-write time
        - TreeMap
            - order is preserved
            - takes more write time as the map gets bigger
    */
    //Methods - see slides


    public static void main(String[] ars){
        //HashMap
        //1.
        Map<Integer, String> names = Map.of(1, "Tim", 2, "Tom", 3, "Sam");
        System.out.println(names);
        System.out.println();

        //2.
        Map<Integer, String> names2 = new HashMap<>();
        names2 = Map.ofEntries( //makes the map immutable!!
                Map.entry(1, "Susan"),
                Map.entry(2, "Sam"),
                Map.entry(3, "Keith"),
                Map.entry(4, "Yana"),
                Map.entry(5, "Anna")
        );
        System.out.println(names2);
        System.out.println();

        //Methods
        //put()
        Map<Integer, String> names3 = new HashMap<>(); //mutable if empty!!
        names3.put(6, "Pete");
        names3.put(-6, "Chris");
        System.out.println(names3);
        System.out.println();

        //get()
        System.out.println(names3.get(-6));
        System.out.println();

        //keySet(): loop over all keys
        for(Integer key: names2.keySet()){
            System.out.println(names2.get(key));
        }
        System.out.println();

        //forEach()
        names.forEach((key, val) -> System.out.println(key + ": " + val));
        names2.values().forEach(System.out::println);
        System.out.println();

        //entrySet()
        names2.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        System.out.println();

        //getOrDefault()
        System.out.println(names2.getOrDefault(4, "Name not found!"));
        System.out.println(names2.getOrDefault(100, "Name not found!"));
        System.out.println();

        //replace()
        names3.replace(-6, "Kate");
        System.out.println(names3);
        System.out.println();

        //putIfAbsent()
        names3.putIfAbsent(4, "Joanna");
        names3.putIfAbsent(6, "Chris");
        System.out.println(names3);
        System.out.println();

        //merge()
        //insert only if it is longer than the original name
        System.out.println(names3);
        BiFunction<String, String, String> logic = (name1, name2) -> name1.length() > name2.length() ? name1:name2;
        System.out.println(names3.merge(6, "Joe", logic)); //returns the value that is kept
        System.out.println(names3.merge(6, "Tafadzwa", logic));
        System.out.println(names3.merge(10, "Sam", logic));
        System.out.println(names3);

    }
}
