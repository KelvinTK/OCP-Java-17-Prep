public class Cat extends Domestic{ //MUST inherit all abstract methods from both superclasses

    @Override
    public void speak(){
        System.out.println("Meow!");
    }

    @Override
    public void walks(){
        System.out.println("Cat walks");
    }
}
