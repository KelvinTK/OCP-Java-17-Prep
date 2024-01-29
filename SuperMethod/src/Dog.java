public class Dog extends Mammal{
    private String name;
    public Dog(String name, int age){
        super(age);
        this.name = name;
        System.out.println("Houff!");
    }
    //if there's no this() or super() in the first line, the compiler will insert super() automatically
}
