public class Dog extends Mammal{
    @Override
    public void speak() { //name exactly as in Mammal, same return type, same parameters, at LEAST the same accessibility
        System.out.println("woof");
    }

    public static void main(String[] args){
        Mammal mammal = new Mammal();
        Dog dog = new Dog();
        NewDog newDog = new NewDog();

        mammal.speak();
        dog.speak();
        newDog.speak();

        //--------
        System.out.println();
        System.out.println();
        CovariantReturnTypes types = new CovariantReturnTypes();
        Shoe shoe = new Shoe();
        System.out.println(types.calculatePrice(100));
        System.out.println(shoe.calculatePrice(100));

    }
}
