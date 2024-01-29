public class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other){
        return this.age - other.age;
    }

    public String getName(){return name;}
    public int getAge() {return age;}
}
