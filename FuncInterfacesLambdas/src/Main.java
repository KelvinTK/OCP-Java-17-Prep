public class Main {
    //Functional interface
    /*
        - has Exactly one abstract method
        - can be annotated with @FunctionalInterface
        - Java has some pre-defined interfaces, eg. Supplier, Predicate, Function etc
    */
    public static void main(String[] args){

        //By creating a new class
        Dog dog = new Dog();
        dog.speak();

        //By anonymous classes - without creating a class
        Animal cat = new Animal() {
            @Override
            public void speak() {
                System.out.println("Meow!");
            }
        };
        cat.speak();

        //Using Lambda expression
        Animal duck = () -> System.out.println("Quack-quack!");
        duck.speak();


    }
}
