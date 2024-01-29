public class Main {
    //Method references: a shorter way of writing lambda expressions
    //Method reference and context
        /*
        - java already knows the number of params of the abstract method
        - so they are inserted without the need to explicitly list them
    */
    public static void main(String[] args){
        Animal pet = s -> System.out.println(s);

        //method reference
        Animal dog = System.out::println; //even shorter
        shout("woof!", pet);
        shout("woof, woof!", dog);
        System.out.println();

        //using method reference with static method
        Calculator lambda = (a, b) -> Math.min(a, b); //using the static method min from math
        Calculator methodRef = Math::min;
        System.out.println(lambda.min(45, 34));
        System.out.println(methodRef.min(45, 34));
        System.out.println();

        //another one
        Calculator02 methodRef2 = Gravity::freeFall; // t -> Gravity.freeFall;
        System.out.println(methodRef2.path(5));
        System.out.println();

        //calling meth reference on an object
        String name = "Kelvin Kutsukutsa";
        Checker methodRef3 = name::isEmpty; // () -> Checker.isEmpty()
        System.out.println(methodRef3.check());
        System.out.println();

        //calling method reference on a parameter
        Checker2 methodRef4 = String::isBlank;
        System.out.println(methodRef4.check("Kelvin")); // s -> s.isBlank()
        System.out.println();

        //calling constructor reference
        Teller methodRef5 = String::new; //s -> new String(s)
        System.out.println(methodRef5.tellName("Kelvin"));

    }
     public static void shout(String s, Animal a){
        a.speak(s);
     }
}
