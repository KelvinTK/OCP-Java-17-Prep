public class Dog extends Mammal {
    private String name = "Chase";
    {
        System.out.println("Name: " + name);
    }

    private static int i = 0;
    static {
        System.out.println("i = " + i);
    }
    {i++;
        System.out.println("Print i " + i);
    }

    public Dog(){
        System.out.println("Houff!");
    }

    public static void main(String[] args){
        System.out.println("Executing main");
        Dog dog = new Dog();
    }

}
