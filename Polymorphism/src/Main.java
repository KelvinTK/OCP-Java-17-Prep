public class Main {
    //Polymorphism
    /*
        - property of an object to take many different forms
        -to access a java object, we have to have a reference pointing to that object
        - there are three ways to access a java object:
            1. using a reference with the same type as the object
            2. using a reference that is a superclass of the object
            3. using an interface reference
        - once a new reference is created, only members of that reference type are accessible via that reference

        Object vs Reference
        - the type of the object determines which properties exist withing the object in memory
        - the type of reference to the object determines which methods and variables are accessible to the java program
    */

    public static void main(String[] args){

        //reference using the same type as the object
        Rex rex = new Rex(); //only one object in memory is created - rex
        System.out.println(rex.weight);
        System.out.println();

        //reference using the superclass type
        Dog dog = rex; //can't access canRunFast is not a member!!! casting is done implicitly
        System.out.println(dog.canRun());
        System.out.println();

        //reference using the interface type
        CanRun canRun = rex; //can't access weight, not a member!!!
        System.out.println(canRun.canRunFast());
        System.out.println();

        //Casting objects
        Rex rex2 = (Rex) dog; //explicit casting - trying to put something larger to something smaller

        //overriding methods
        new GreatDane().printSpeed();




    }
}
