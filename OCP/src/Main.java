import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        System.out.println("First name " + args[0]);
//        System.out.println("Last name " + args[1]);
        Random rand = new Random();
        System.out.println(rand.nextInt(100));
        Student student = new Student(); //new object is created, constructor is called
        student.name = "Kelvin Kuts";
        System.out.println(student.name);

    }
}

class  Student{
    public Student(){ //constructor, same name as class - no return type else it's a method
        System.out.println("Constructor is called");
    }
    String name; //instance variable
}