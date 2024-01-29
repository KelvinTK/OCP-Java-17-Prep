import java.util.*;

public class Main {
    //Sorting
    /*
        - primitives are sorted by their natural order
        - strings: numbers sort before letters, uppercase letters sort before lowercase letters
        -elements can be any type of objects
            - define own sorting criteria
                1. use a  class which implements Comparable<T> interface or
                2. pass the implementation of Comparator<T> interface in sort() method
    */


    public static void main(String[] args){
        //Comparable Interface
        List<Person> people = Arrays.asList(
                new Person("Kate", 24),
                new Person("Steve", 16),
                new Person("Romio", 30)
        );

        Collections.sort(people);
        for(Person person: people)
            System.out.println(person.getName() + ", "+ person.getAge());

        System.out.println();

        //Comparator Interface
        List<Person2> people2 = Arrays.asList(
                new Person2("Kate", 24),
                new Person2("Steve", 16),
                new Person2("Romio", 30)
        );
            //sort by age
        Collections.sort(people2, (p1, p2) -> p1.getAge() - p2.getAge());
        for (Person2 person: people2)
            System.out.println(person.getName()+ ", " + person.getAge());

        System.out.println();

            //sort by name
        Collections.sort(people2, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        for (Person2 person: people2)
            System.out.println(person.getName()+ ", " + person.getAge());

        System.out.println();
        //without using lambda (using anonymous class)
        List<Person2> people3 = Arrays.asList(
                new Person2("Kate", 24),
                new Person2("Steve", 16),
                new Person2("Romio", 30)
        );
        Comparator<Person2> byAge = new Comparator<Person2>() {
            public int compare (Person2 p1, Person2 p2){
                return p1.getAge() - p2.getAge();
            }
        };

        Collections.sort(people3, byAge);
        for (Person2 person: people3)
            System.out.println(person.getName()+ ", " + person.getAge());

    }
}
