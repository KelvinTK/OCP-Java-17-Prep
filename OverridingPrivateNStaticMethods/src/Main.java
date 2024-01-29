public class Main {
    //if the method is private, it is not visible to other classes
        /*
        - the method with the same signaturenin subclass is INDEPENDENT of that method
        - this is NOT overriding, it's just a completely different method
        */

    //if the method is static, "overriding" method must also be declared static
        /*
        - this is not overriding since each method belongs to its class
        - this is called 'hiding' the method
        */

    //Methods marked as final cannot be overriden

    public static void main(String[] args){
        A.greet();
        B.greet();
        System.out.println();

        Dog dog = new Dog();
        Mammal mammal = dog; //allowed because Dog is a subclass of Mammal
        System.out.println(dog.name);
        System.out.println(mammal.name);
    }
}
