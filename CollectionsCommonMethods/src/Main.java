import java.util.*;

public class Main {
    //List, Set, Queue(Deque), Map
    //interfaces, commonly refered to as collections
    /*
        - interfaces List, Set, Queue implement Collection
        - class ArrayList implements List
        - classes HashSet and TreeSet implement Set
        - interface Deque implements Queue
        - classes LinkedList implements Queue and List
        - interface Map DOESN'T implement Collection
        - classes HashMap and TreeMap implement Map interface
    */

    public static void main(String[]args){

        //diamond operator (<>) is used to imply the type of the element in collection
        List<String> names = new ArrayList<String>();

        //can omit the type on the RHS
        List<Integer> nums = new ArrayList<>();

        //when using var, specify the type on the RHS
        var cars = new ArrayList<String>();


        //METHODS
        //add() method: adds an element into the collection
        names.add("Kelvin");
        names.add("Maria");
        names.add("Steve");
        names.add("Kelvin"); //allows duplicate entries
        System.out.println(names);
        System.out.println();

        Collection<String> nms = new HashSet<>();
        nms.add("John"); //DOESN'T allow duplicate entries
        System.out.println(nms);
        System.out.println();

        //remove() method
        names.remove(0);
        System.out.println(names);
        names.remove("Maria");
        System.out.println(names);
        System.out.println();

        //isEmpty()
        System.out.println(names.isEmpty());
        System.out.println(cars.isEmpty());
        System.out.println();

        //size()
        System.out.println(names.size());
        System.out.println();

        //clear()
        nms.clear();
        System.out.println(nms.size());
        System.out.println();

        //contains()
        System.out.println(names.contains("Steve"));
        System.out.println();

        //removeIf
        names.removeIf(name -> name.length()>5);
        System.out.println(names);
        System.out.println();

        //forEach()
        names.add("Jona");
        names.forEach(name -> System.out.print(name + ", "));

        //equals() - comparing the type and contents of the collection
        //implementations vary: ArrayLists checks order, HashSet does not etc
    }
}
