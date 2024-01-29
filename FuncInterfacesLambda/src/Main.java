public class Main {

    static public void main(String[] args){
        //can create multiple implementations
        Animal dog = ()-> System.out.println("woof!");
        Animal cat = ()-> System.out.println("meow!");
        Animal duck = ()-> System.out.println("quack, quack!");

        Multiplicable times = (x, y) -> x*y;
        Multiplicable divide = (x, y) -> { //also allowed
          return  x / y;
        };

        Multiplicable mode = (int x, int y) -> { //also allowed
            return  x % y;
        };

        dog.speak();
        cat.speak();
        duck.speak();
        System.out.println();

        System.out.println(times.multiply(45, 2));
        System.out.println(divide.multiply(98, 2));
        System.out.println(mode.multiply(98, 9));
    }
}
