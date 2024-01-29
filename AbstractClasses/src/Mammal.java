public abstract class Mammal {

    //Abstract classes can be extended but not initialized
    //CANNOT be marked final, (final, static or private for methods) - they won't be overridden
    //can have constructors BUT they can be only called using super()
    public abstract void speak(); //abstract methods do NOT have a body
}
