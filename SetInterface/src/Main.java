import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    //Set Interface
    /*
        - doesn't allow duplicate entries
        - implements HashSet, TreeSet
        - HashSet: stores (key, value) pairs in the hash table
            - key is hashCode(), value is Object
            - doesn't keep order
            - adding each element takes the same time
        -TreeSet: stores elements in a sorted structure
            - keeps the order
            - adding takes more time as the tree grows bigger
    */
    static public  void main(String[] args){
        //HashSet
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Tim"));
        System.out.println(names.add("Tom"));
        System.out.println(names.add("Tom"));//false - doesn't allow duplicates
        System.out.println(names);
        System.out.println();

        //TreeSet
        Set<String> names2 = new TreeSet<>();
        System.out.println(names2.add("Jane"));
        System.out.println(names2.add("Jane")); //false - doesn't allow duplicates
        System.out.println(names2.add("Pete"));
        System.out.println(names2.add("Sam"));

        System.out.println(names2);
        //false - doesn't allow duplicates
    }
}
