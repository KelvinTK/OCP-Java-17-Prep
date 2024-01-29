public class InitializingObjects {
    //order of initialization
    /*
    1. if there's a superclass, it is initialized first
    2. All static variables are processed (in order of appearance)
    3. All static initializers are processed (in order of appearance)
    --This happens at most once for each class
    --initialized automatically for a class with the main method

    - final instance variables must assume the value by the time the constructor completes
    - final local variables mus have a value only if used
    */

    private final double tax;
    private final double price;

    public InitializingObjects(){
        this.tax = 12.5; //initialization in the constructor
    }
    {
        price = 0.2; //initialization in the instance initializer
    }
    //the instance initializer is processed before the constructor
}
