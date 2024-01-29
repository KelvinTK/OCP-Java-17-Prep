public interface Mammal {
    public void eats();
    public void walks();

    //new method
    default void sleeps(){ //no need to implement it in the other classes
        System.out.println("A mammal sleeps");
    }
    //default method
    /*
        - keyword default can only be used in the interface
        - must have a body
        - is implicitly public
        - cannot be made abstract, final or static
        - may or may not be overridden by a class implementing the interface
        - if the class inherits 2 or more default methods with the same signature, then it must override the method
    */
}
