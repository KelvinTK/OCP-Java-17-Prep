public class NewDog extends Mammal{
    @Override
    public void speak(){
        System.out.println();
        System.out.println("woof!");
        super.speak(); //also calls the same method in Mammal
    }
}
