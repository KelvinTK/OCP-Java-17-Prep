public class Dog implements Mammal, MammalDuplicateMethod{
    public int eats(){ //implement duplicate method just once, implement both if the return types are different
        System.out.println("Eating meat");
        return 4;
    }
}
