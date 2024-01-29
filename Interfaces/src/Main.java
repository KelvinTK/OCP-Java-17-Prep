public class Main {
    //Interfaces
    /*
        - a class can only extend one class
        - but what if we want to extend more (abstract) classes?
        - then we use interfaces
            - similar to abstract class
            - but now one class can IMPLEMENT any number of interfaces
            - use keyword implements, separated by comma
        - like abstract classes, an instance of an interface cannot be created using the keyword new
        - all overriding rules apply
        - an interface can extend another interface and all rules as abstract methods apply
    */
    public static void main(String[] args){
        FordModelT modelT = new FordModelT();
        System.out.println(modelT.getColor());
        System.out.println(modelT.maxDist(80));

        System.out.println();
        Dog dog = new Dog();
        System.out.println(dog.eats());
    }
}
