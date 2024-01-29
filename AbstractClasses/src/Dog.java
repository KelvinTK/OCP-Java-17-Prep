public class Dog extends Mammal{

    //This class must implement ALL inherited methods
    //ALL overriding rules apply

    @Override
    public void speak(){ //abstract method in super can now be implemented here.
        System.out.println("Woof!");
    }


}
