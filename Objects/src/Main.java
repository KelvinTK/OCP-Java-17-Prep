
public class Main {

    //instance variable
    private String name = "Kelvin"; //

    //Constructor - executed after the initializer
    public Main(){
        name = "Tafadzwa";
        System.out.println("The constructor has been called");
    }

    //initializer
    {System.out.println("The initializer has been called");} //executed first

    public static void main(String[] args) {
       //object - an instance of a class
        Main mayn = new Main(); // called first and a new object is created
        System.out.println(mayn.name); // executed last

    }
}