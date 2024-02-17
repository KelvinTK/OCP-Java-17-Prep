public class Main {
    //Types of Nested Classes
    /*
        1. Inner Class
            - non-static type, defined at the member level of the class
            - can have access modifier
            - can extend another class and/or implement other interfaces
            - can be marked abstract or final
            - can access ALL members of the enclosing class
        2. Static Nested Class
            - static type, defined at the member level of the class
            - can't access instance variables or methods declared in the outer class
            - the instance of the wider class is not needed to access it
            - can be marked private or protected
        3. Local Class
            - a class defined within a method body
            - has limited scope
            - don't have access modifiers
            - can be marked abstract or final
            - can access all members of the enclosing class
            - can access final and effectively final variables
        4. Anonymous class
            - a local class which doesn't have a name
            - is a special type of a local class but without a name
            - must extend an existing class or implement an existing interface
    */
    public static void main(String[] args){
        //Inner Classes
        var innerClasses = new InnerClasses();
        innerClasses.printTwice();
        System.out.println();

        var nested = innerClasses.new Nested();
        nested.printHello2();
        System.out.println();

        new InnerClasses().new Nested().printHello2();
        System.out.println();

        //multiple nested classes
        InnerClasses2 inner2 = new InnerClasses2();
        InnerClasses2.Nested1 nested1 = inner2.new Nested1(); //var nested1 = inner2.new Nested1();
        InnerClasses2.Nested1.Nested2 nested2 = nested1.new Nested2(); //var nested2 = nested1.new Nested2();
        nested2.printT();
        System.out.println();

        //Static Nested Classes
        //run main in StaticNested

        //Local Classes
        var localClasses = new LocalClasses();
        localClasses.calculateArea();
        System.out.println();

        //Anonymous Classes

    }
}
