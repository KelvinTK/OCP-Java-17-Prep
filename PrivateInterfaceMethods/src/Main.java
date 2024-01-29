public class Main {
    //private interface methods CANNOT be overridden, CANNOT be called

    /*
        - marked with keyword private
        - must have a body
        - private static methods may be called by any method in the interface
        - non-static private methods can only be called by non-static methods
        - default and private non-static methods can call abstract methods
    */
    public static void main(String[] args){
        Ford ford = new Ford();
        ford.speed();

    }
}
