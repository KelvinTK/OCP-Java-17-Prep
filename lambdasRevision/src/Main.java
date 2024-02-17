@FunctionalInterface
interface Animal {
    public void speak(String s);
}
public class Main{
    public static void shout(String s, Animal a) {
        a.speak(s);
    }
    public static void main(String[] args) {
        Animal myAnimal = s -> System.out.println(s);
        shout("Woof!", myAnimal);
    }
}
